import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import club.smarti.asserts.Asserts;
import club.smarti.asserts.exceptions.AssertEmptyCheckException;
import club.smarti.asserts.exceptions.AssertNullCheckException;
import club.smarti.java.Lists;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestEmpty {

    @Test
    @SuppressWarnings("ObviousNullCheck")
    public void testNotEmpty() {
        assertThrows(AssertNullCheckException.class, () -> Asserts.notEmpty((Object[]) null));

        assertDoesNotThrow(() -> Asserts.notEmpty(new boolean[]{false}));
        assertDoesNotThrow(() -> Asserts.notEmpty(new byte[]{0}));
        assertDoesNotThrow(() -> Asserts.notEmpty(new char[]{'a', 'b'}));
        assertDoesNotThrow(() -> Asserts.notEmpty(new short[]{1, 2, 3}));
        assertDoesNotThrow(() -> Asserts.notEmpty(new int[]{1, 2, 3}));
        assertDoesNotThrow(() -> Asserts.notEmpty(new long[]{1L, 2L, 3L}));
        assertDoesNotThrow(() -> Asserts.notEmpty(new float[]{1f, 2f, 3f}));
        assertDoesNotThrow(() -> Asserts.notEmpty(new double[]{1.0, 2.0, 3.0}));
        assertDoesNotThrow(() -> Asserts.notEmpty(new String[]{"S1"}));
        assertDoesNotThrow(() -> Asserts.notEmpty(Lists.create(1, 2, 3)));
        assertDoesNotThrow(() -> Asserts.notEmpty(Lists.create(1, 2.0, "3")));
        assertDoesNotThrow(() -> Asserts.notEmpty(new HashSet<>(Lists.create(1, 2, 3))));
        assertDoesNotThrow(() -> Asserts.notEmpty(new HashMap<>() {{
            put(null, null);
        }}));
        assertDoesNotThrow(() -> Asserts.notEmpty(" "));
        assertDoesNotThrow(() -> Asserts.notEmpty(new int[][]{{}, {}}));

        assertThrows(AssertEmptyCheckException.class, () -> Asserts.notEmpty(new boolean[0]));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.notEmpty(new byte[0]));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.notEmpty(new char[0]));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.notEmpty(new short[0]));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.notEmpty(new int[0]));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.notEmpty(new long[0]));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.notEmpty(new float[0]));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.notEmpty(new double[0]));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.notEmpty(new String[0]));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.notEmpty(new ArrayList<>()));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.notEmpty(new HashSet<>()));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.notEmpty(new HashMap<>()));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.notEmpty(""));
    }

    @Test
    @SuppressWarnings("ObviousNullCheck")
    public void testEmpty() {
        assertThrows(AssertNullCheckException.class, () -> Asserts.empty((Object[]) null));

        assertThrows(AssertEmptyCheckException.class, () -> Asserts.empty(new boolean[]{false}));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.empty(new byte[]{0}));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.empty(new char[]{'a', 'b'}));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.empty(new short[]{1, 2, 3}));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.empty(new int[]{1, 2, 3}));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.empty(new long[]{1L, 2L, 3L}));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.empty(new float[]{1f, 2f, 3f}));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.empty(new double[]{1.0, 2.0, 3.0}));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.empty(new String[]{"S1"}));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.empty(Lists.create(1, 2, 3)));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.empty(Lists.create(1, 2.0, "3")));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.empty(new HashSet<>(Lists.create(1, 2, 3))));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.empty(new HashMap<>() {{
            put(null, null);
        }}));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.empty(" "));
        assertThrows(AssertEmptyCheckException.class, () -> Asserts.empty(new int[][]{{}, {}}));

        assertDoesNotThrow(() -> Asserts.empty(new boolean[0]));
        assertDoesNotThrow(() -> Asserts.empty(new byte[0]));
        assertDoesNotThrow(() -> Asserts.empty(new char[0]));
        assertDoesNotThrow(() -> Asserts.empty(new short[0]));
        assertDoesNotThrow(() -> Asserts.empty(new int[0]));
        assertDoesNotThrow(() -> Asserts.empty(new long[0]));
        assertDoesNotThrow(() -> Asserts.empty(new float[0]));
        assertDoesNotThrow(() -> Asserts.empty(new double[0]));
        assertDoesNotThrow(() -> Asserts.empty(new String[0]));
        assertDoesNotThrow(() -> Asserts.empty(new ArrayList<>()));
        assertDoesNotThrow(() -> Asserts.empty(new HashSet<>()));
        assertDoesNotThrow(() -> Asserts.empty(new HashMap<>()));
        assertDoesNotThrow(() -> Asserts.empty(""));
    }
}