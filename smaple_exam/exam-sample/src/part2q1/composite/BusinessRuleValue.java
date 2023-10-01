package part2q1.composite;

import java.util.Map;

public interface BusinessRuleValue {
    
    public Object evaluate(Map<String, Object> values);

}