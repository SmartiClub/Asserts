import org.junit.jupiter.api.Test;

import java.util.List;

import club.smarti.asserts.Asserts;
import club.smarti.asserts.exceptions.AssertContentException;
import club.smarti.asserts.exceptions.AssertNullCheckException;
import club.smarti.java.Lists;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestContent {

    @Test
    @SuppressWarnings("ObviousNullCheck")
    public void testContains() {
        // Array
        assertDoesNotThrow(() -> Asserts.contains(null, new Object[]{null}));
        assertDoesNotThrow(() -> Asserts.contains(null, new Object[]{null, null}));
        assertDoesNotThrow(() -> Asserts.contains(null, new Object[]{new Object(), null}));
        assertThrows(AssertNullCheckException.class, () -> Asserts.contains(null, (Object[]) null));
        assertThrows(AssertContentException.class, () -> Asserts.contains(null, new Integer[]{1, 2, 3}));

        assertDoesNotThrow(() -> Asserts.contains(0, new Integer[]{0}));
        assertDoesNotThrow(() -> Asserts.contains(3, new Integer[]{1, 2, 3}));
        assertDoesNotThrow(() -> Asserts.contains(3, new Integer[]{1, null, 3}));
        assertThrows(AssertContentException.class, () -> Asserts.contains(4, new Integer[]{1, 2, 3}));

        assertDoesNotThrow(() -> Asserts.contains("S1", new String[]{"S1"}));
        assertDoesNotThrow(() -> Asserts.contains("S3", new String[]{"S1", "S2", "S3"}));
        assertDoesNotThrow(() -> Asserts.contains("S3", new String[]{"S1", null, "S3"}));
        assertThrows(AssertContentException.class, () -> Asserts.contains("S4", new String[]{"S1", null, "S3"}));

        // List
        assertDoesNotThrow(() -> Asserts.contains(null, Lists.create((Object) null)));
        assertDoesNotThrow(() -> Asserts.contains(null, Lists.create(null, null)));
        assertDoesNotThrow(() -> Asserts.contains(null, Lists.create(new Object(), null)));
        assertThrows(AssertNullCheckException.class, () -> Asserts.contains(null, (List<?>) null));
        assertThrows(AssertContentException.class, () -> Asserts.contains(null, Lists.create(1, 2, 3)));

        assertDoesNotThrow(() -> Asserts.contains(0, Lists.create(0)));
        assertDoesNotThrow(() -> Asserts.contains(3, Lists.create(1, 2, 3)));
        assertDoesNotThrow(() -> Asserts.contains(3, Lists.create(1, null, 3)));
        assertThrows(AssertContentException.class, () -> Asserts.contains(4, Lists.create(1, 2, 3)));

        assertDoesNotThrow(() -> Asserts.contains("S1", Lists.create("S1")));
        assertDoesNotThrow(() -> Asserts.contains("S3", Lists.create("S1", "S2", "S3")));
        assertDoesNotThrow(() -> Asserts.contains("S3", Lists.create("S1", null, "S3")));
        assertThrows(AssertContentException.class, () -> Asserts.contains("S4", Lists.create("S1", null, "S3")));

        // String
        assertThrows(AssertNullCheckException.class, () -> Asserts.contains(null, "text"));
        assertThrows(AssertNullCheckException.class, () -> Asserts.contains("sub", (String) null));

        assertDoesNotThrow(() -> Asserts.contains("A", "A"));
        assertDoesNotThrow(() -> Asserts.contains("C", "ABC"));
        assertDoesNotThrow(() -> Asserts.contains("Aa", "AaBbCc"));
        assertDoesNotThrow(() -> Asserts.contains("AaBbCc", "AaBbCc"));
        assertThrows(AssertContentException.class, () -> Asserts.contains("X", "ABC"));
        assertThrows(AssertContentException.class, () -> Asserts.contains("BB", "AaBbCc"));
        assertThrows(AssertContentException.class, () -> Asserts.contains(".*", "ABC"));
    }

    @Test
    @SuppressWarnings("ObviousNullCheck")
    public void testNotContain() {
        // Array
        assertThrows(AssertContentException.class, () -> Asserts.notContains(null, new Object[]{null}));
        assertThrows(AssertContentException.class, () -> Asserts.notContains(null, new Object[]{null, null}));
        assertThrows(AssertContentException.class, () -> Asserts.notContains(null, new Object[]{new Object(), null}));
        assertThrows(AssertNullCheckException.class, () -> Asserts.notContains(null, (Object[]) null));
        assertDoesNotThrow(() -> Asserts.notContains(null, new Integer[]{1, 2, 3}));

        assertThrows(AssertContentException.class, () -> Asserts.notContains(0, new Integer[]{0}));
        assertThrows(AssertContentException.class, () -> Asserts.notContains(3, new Integer[]{1, 2, 3}));
        assertThrows(AssertContentException.class, () -> Asserts.notContains(3, new Integer[]{1, null, 3}));
        assertDoesNotThrow(() -> Asserts.notContains(4, new Integer[]{1, 2, 3}));

        assertThrows(AssertContentException.class, () -> Asserts.notContains("S1", new String[]{"S1"}));
        assertThrows(AssertContentException.class, () -> Asserts.notContains("S3", new String[]{"S1", "S2", "S3"}));
        assertThrows(AssertContentException.class, () -> Asserts.notContains("S3", new String[]{"S1", null, "S3"}));
        assertDoesNotThrow(() -> Asserts.notContains("S4", new String[]{"S1", null, "S3"}));

        // List
        assertThrows(AssertContentException.class, () -> Asserts.notContains(null, Lists.create((Object) null)));
        assertThrows(AssertContentException.class, () -> Asserts.notContains(null, Lists.create(null, null)));
        assertThrows(AssertContentException.class, () -> Asserts.notContains(null, Lists.create(new Object(), null)));
        assertThrows(AssertNullCheckException.class, () -> Asserts.notContains(null, (List<?>) null));
        assertDoesNotThrow(() -> Asserts.notContains(null, Lists.create(1, 2, 3)));

        assertThrows(AssertContentException.class, () -> Asserts.notContains(0, Lists.create(0)));
        assertThrows(AssertContentException.class, () -> Asserts.notContains(3, Lists.create(1, 2, 3)));
        assertThrows(AssertContentException.class, () -> Asserts.notContains(3, Lists.create(1, null, 3)));
        assertDoesNotThrow(() -> Asserts.notContains(4, Lists.create(1, 2, 3)));

        assertThrows(AssertContentException.class, () -> Asserts.notContains("S1", Lists.create("S1")));
        assertThrows(AssertContentException.class, () -> Asserts.notContains("S3", Lists.create("S1", "S2", "S3")));
        assertThrows(AssertContentException.class, () -> Asserts.notContains("S3", Lists.create("S1", null, "S3")));
        assertDoesNotThrow(() -> Asserts.notContains("S4", Lists.create("S1", null, "S3")));

        // String
        assertThrows(AssertNullCheckException.class, () -> Asserts.notContains(null, "text"));
        assertThrows(AssertNullCheckException.class, () -> Asserts.notContains("sub", (String) null));

        assertThrows(AssertContentException.class, () -> Asserts.notContains("A", "A"));
        assertThrows(AssertContentException.class, () -> Asserts.notContains("C", "ABC"));
        assertThrows(AssertContentException.class, () -> Asserts.notContains("Aa", "AaBbCc"));
        assertThrows(AssertContentException.class, () -> Asserts.notContains("AaBbCc", "AaBbCc"));
        assertDoesNotThrow(() -> Asserts.notContains("X", "ABC"));
        assertDoesNotThrow(() -> Asserts.notContains("BB", "AaBbCc"));
        assertDoesNotThrow(() -> Asserts.notContains(".*", "ABC"));
    }
}