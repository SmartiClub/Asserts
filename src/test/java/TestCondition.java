import org.junit.jupiter.api.Test;

import club.smarti.asserts.Asserts;
import club.smarti.asserts.exceptions.AssertConditionException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCondition {

    @Test
    public void testIsTrue() {
        assertDoesNotThrow(() -> Asserts.isTrue(true));
        assertThrows(AssertConditionException.class, () -> Asserts.isTrue(false));
    }

    @Test
    public void testIsFalse() {
        assertDoesNotThrow(() -> Asserts.isFalse(false));
        assertThrows(AssertConditionException.class, () -> Asserts.isFalse(true));
    }
}