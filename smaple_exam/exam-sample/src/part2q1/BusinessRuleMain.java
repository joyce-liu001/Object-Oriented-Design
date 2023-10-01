package part2q1;

import org.json.JSONArray;
import org.json.JSONObject;

import part2q1.composite.AndOperator;
import part2q1.composite.BusinessRuleValue;
import part2q1.composite.ConstantValue;
import part2q1.composite.GreaterThanOperator;
import part2q1.composite.LookupValue;
import part2q1.composite.NotBlankOperator;
import part2q1.composite.OrOperator;

public class BusinessRuleMain {
    public static BusinessRule generateRule(String inputBusinessRule) {
        return generateRuleFromJSON(new JSONObject(inputBusinessRule));
    }

    public static BusinessRule generateRuleFromJSON(JSONObject inputBusinessRule) {
        String operator = inputBusinessRule.getString("Operator");

        if (operator.equals("AND")) {
            JSONArray args = inputBusinessRule.getJSONArray("Args");
            return new AndOperator(generateRuleFromJSON(args.getJSONObject(0)), generateRuleFromJSON(args.getJSONObject(1)));
        } else if (operator.equals("OR")) {
            JSONArray args = inputBusinessRule.getJSONArray("Args");
            return new OrOperator(generateRuleFromJSON(args.getJSONObject(0)), generateRuleFromJSON(args.getJSONObject(1)));
        } else if (operator.equals("GREATER THAN")) {
            JSONArray args = inputBusinessRule.getJSONArray("Args");
            return new GreaterThanOperator(generateRuleValueFromJSON(args.getJSONObject(0)), generateRuleValueFromJSON(args.getJSONObject(1)));
        } else if (operator.equals("NOT BLANK")) {
            JSONObject arg = inputBusinessRule.getJSONObject("Arg");
            return new NotBlankOperator(generateRuleValueFromJSON(arg));
        }

        return null;
    }

    public static BusinessRuleValue generateRuleValueFromJSON(JSONObject value) {
        String operator = value.getString("Operator");
        Object arg = value.get("Arg");
        if (operator.equals("LOOKUP")) {
            return new LookupValue((String) arg);
        } else if (operator.equals("CONSTANT")) {
            return new ConstantValue((Integer) arg);
        }

        return null;
    }
}
