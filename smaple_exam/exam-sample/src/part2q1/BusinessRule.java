package part2q1;

import java.util.Map;

public interface BusinessRule {
    public boolean evaluate(Map<String, Object> values);
}
