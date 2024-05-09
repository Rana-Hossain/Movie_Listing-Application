import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class validator {
    @Test
    public void testContainsAtSymbol() {
        assertTrue(test.containsAtSymbol("user@example.com"));
        assertFalse(test.containsAtSymbol("example.com"));
    }
}
