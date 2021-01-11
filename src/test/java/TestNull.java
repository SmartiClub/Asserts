import org.junit.jupiter.api.Test;

import club.smarti.asserts.Asserts;
import club.smarti.asserts.exceptions.AssertNullCheckException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestNull {

    @Test
    @SuppressWarnings("ObviousNullCheck")
    public void testIsNull() {
        assertDoesNotThrow(() -> Asserts.isNull(null));
        assertThrows(AssertNullCheckException.class, () -> Asserts.isNull(new Object()));
    }

    @Test
    public void testNotNull() {
        assertDoesNotThrow(() -> Asserts.notNull(new Object()));
        assertThrows(AssertNullCheckException.class, () -> Asserts.notNull(null));
    }
}