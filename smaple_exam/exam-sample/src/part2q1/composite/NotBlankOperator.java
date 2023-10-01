package part2q1.composite;

import java.util.Map;

import part2q1.BusinessRule;

public class NotBlankOperator implements BusinessRule {

    private BusinessRuleValue value;

    public NotBlankOperator(BusinessRuleValue value) {
        this.value = value;
    }

    @Override
    public boolean evaluate(Map<String, Object> values) {
        Object val = value.evaluate(values);

        if (val == null) {
            return false;
        }

        String valAsString = (String) val;
        return !valAsString.isBlank();
    }
    
}