import org.junit.jupiter.api.Test;

import club.smarti.asserts.Asserts;
import club.smarti.asserts.exceptions.base.AssertException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCore {

    @Test
    @SuppressWarnings("Convert2MethodRef")
    public void testEnabled() {
        // Enabled by default
        assertThrows(AssertException.class, () -> Asserts.fail());

        Asserts.setEnabled(false);
        assertDoesNotThrow(() -> Asserts.fail());

        // Turn it back on
        Asserts.setEnabled(true);
        assertThrows(AssertException.class, () -> Asserts.fail());
    }

    @Test
    public void testStacktrace() {
        try {
            Asserts.fail("Test");
        }
        catch (AssertException exception) {
            StackTraceElement[] stack = exception.getStackTrace();
            StackTraceElement topCaller = stack[0];
            assertEquals(TestCore.class.getName(), topCaller.getClassName());
        }
    }
}