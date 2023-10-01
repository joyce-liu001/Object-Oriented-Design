package part2q1.composite;

import java.util.Map;

public class ConstantValue implements BusinessRuleValue {

    private Integer value;

    public ConstantValue(Integer value) {
        this.value = value;
    }

    @Override
    public Object evaluate(Map<String, Object> values) {
        return value;
    }
    
}