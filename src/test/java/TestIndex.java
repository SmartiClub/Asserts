import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import club.smarti.asserts.Asserts;
import club.smarti.asserts.exceptions.AssertIndexException;
import club.smarti.asserts.exceptions.AssertKeyException;
import club.smarti.asserts.exceptions.AssertNullCheckException;
import club.smarti.asserts.interfaces.HasIndex;
import club.smarti.java.Lists;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestIndex {

    @Test
    @SuppressWarnings({"Convert2Lambda", "ObviousNullCheck"})
    public void testIndex() {
        assertDoesNotThrow(() -> Asserts.index(0, new boolean[]{true}));
        assertDoesNotThrow(() -> Asserts.index(1, new boolean[]{true, false}));
        assertThrows(AssertNullCheckException.class, () -> Asserts.index(0, (boolean[]) null));
        assertThrows(AssertIndexException.class, () -> Asserts.index(0, new boolean[0]));
        assertThrows(AssertIndexException.class, () -> Asserts.index(1, new boolean[]{true}));

        assertDoesNotThrow(() -> Asserts.index(0, new byte[]{0}));
        assertDoesNotThrow(() -> Asserts.index(1, new byte[]{1, 2}));
        assertThrows(AssertNullCheckException.class, () -> Asserts.index(0, (byte[]) null));
        assertThrows(AssertIndexException.class, () -> Asserts.index(0, new byte[0]));
        assertThrows(AssertIndexException.class, () -> Asserts.index(1, new byte[]{100}));

        assertDoesNotThrow(() -> Asserts.index(0, new char[]{0}));
        assertDoesNotThrow(() -> Asserts.index(1, new char[]{1, 2}));
        assertThrows(AssertNullCheckException.class, () -> Asserts.index(0, (char[]) null));
        assertThrows(AssertIndexException.class, () -> Asserts.index(0, new char[0]));
        assertThrows(AssertIndexException.class, () -> Asserts.index(1, new char[]{100}));

        assertDoesNotThrow(() -> Asserts.index(0, new short[]{0}));
        assertDoesNotThrow(() -> Asserts.index(1, new short[]{1, 2}));
        assertThrows(AssertNullCheckException.class, () -> Asserts.index(0, (short[]) null));
        assertThrows(AssertIndexException.class, () -> Asserts.index(0, new short[0]));
        assertThrows(AssertIndexException.class, () -> Asserts.index(1, new short[]{100}));

        assertDoesNotThrow(() -> Asserts.index(0, new int[]{0}));
        assertDoesNotThrow(() -> Asserts.index(1, new int[]{1, 2}));
        assertThrows(AssertNullCheckException.class, () -> Asserts.index(0, (int[]) null));
        assertThrows(AssertIndexException.class, () -> Asserts.index(0, new int[0]));
        assertThrows(AssertIndexException.class, () -> Asserts.index(1, new int[]{100}));

        assertDoesNotThrow(() -> Asserts.index(0, new long[]{0}));
        assertDoesNotThrow(() -> Asserts.index(1, new long[]{1, 2}));
        assertThrows(AssertNullCheckException.class, () -> Asserts.index(0, (long[]) null));
        assertThrows(AssertIndexException.class, () -> Asserts.index(0, new long[0]));
        assertThrows(AssertIndexException.class, () -> Asserts.index(1, new long[]{100}));

        assertDoesNotThrow(() -> Asserts.index(0, new float[]{0f}));
        assertDoesNotThrow(() -> Asserts.index(1, new float[]{1f, 2f}));
        assertThrows(AssertNullCheckException.class, () -> Asserts.index(0, (float[]) null));
        assertThrows(AssertIndexException.class, () -> Asserts.index(0, new float[0]));
        assertThrows(AssertIndexException.class, () -> Asserts.index(1, new float[]{100f}));

        assertDoesNotThrow(() -> Asserts.index(0, new double[]{0.0}));
        assertDoesNotThrow(() -> Asserts.index(1, new double[]{1.0, 2.0}));
        assertThrows(AssertNullCheckException.class, () -> Asserts.index(0, (double[]) null));
        assertThrows(AssertIndexException.class, () -> Asserts.index(0, new double[0]));
        assertThrows(AssertIndexException.class, () -> Asserts.index(1, new double[]{100.0}));

        assertDoesNotThrow(() -> Asserts.index(0, new String[]{"S1"}));
        assertDoesNotThrow(() -> Asserts.index(1, new String[]{"S1", "S2"}));
        assertThrows(AssertNullCheckException.class, () -> Asserts.index(0, (String[]) null));
        assertThrows(AssertIndexException.class, () -> Asserts.index(0, new String[0]));
        assertThrows(AssertIndexException.class, () -> Asserts.index(1, new String[]{"S1"}));

        assertDoesNotThrow(() -> Asserts.index(0, Lists.create(1)));
        assertDoesNotThrow(() -> Asserts.index(1, Lists.create(1, 2)));
        assertThrows(AssertNullCheckException.class, () -> Asserts.index(0, (List<?>) null));
        assertThrows(AssertIndexException.class, () -> Asserts.index(0, Lists.create()));
        assertThrows(AssertIndexException.class, () -> Asserts.index(1, Lists.create("S1")));

        assertDoesNotThrow(() -> Asserts.index(0, new HasIndex() {
            @Override
            public int size() {
                return 1;
            }
        }));
        assertDoesNotThrow(() -> Asserts.index(1, new HasIndex() {
            @Override
            public int size() {
                return 2;
            }
        }));
        assertThrows(AssertNullCheckException.class, () -> Asserts.index(0, (HasIndex) null));
        assertThrows(AssertIndexException.class, () -> Asserts.index(0, new HasIndex() {
            @Override
            public int size() {
                return 0;
            }
        }));
        assertThrows(AssertIndexException.class, () -> Asserts.index(1, new HasIndex() {
            @Override
            public int size() {
                return 0;
            }
        }));
    }

    @Test
    public void testKey() {
        assertThrows(AssertNullCheckException.class, () -> Asserts.key(0, null));

        HashMap<Integer, String> map = new HashMap<>();
        assertThrows(AssertKeyException.class, () -> Asserts.key(0, map));
        assertThrows(AssertKeyException.class, () -> Asserts.key(null, map));

        map.put(10, "S10");
        assertDoesNotThrow(() -> Asserts.key(10, map));
        assertThrows(AssertKeyException.class, () -> Asserts.key(0, map));
    }
}