package part2q1.composite;

import java.util.Map;

public class LookupValue implements BusinessRuleValue {

    private String key;

    public LookupValue(String key) {
        this.key = key;
    }

    @Override
    public Object evaluate(Map<String, Object> values) {
        return values.get(key);
    }
    
}