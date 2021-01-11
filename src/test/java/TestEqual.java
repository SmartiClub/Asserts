import org.junit.jupiter.api.Test;

import club.smarti.asserts.Asserts;
import club.smarti.asserts.exceptions.AssertEqualityException;
import club.smarti.asserts.exceptions.AssertIncomparableException;
import club.smarti.java.Lists;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestEqual {

    @Test
    @SuppressWarnings({"UnnecessaryBoxing"})
    public void testEqual() {
        // Object - Object
        assertDoesNotThrow(() -> Asserts.equal((Object) null, null));
        assertDoesNotThrow(() -> Asserts.equal("Text", "Text"));
        assertDoesNotThrow(() -> Asserts.equal(Lists.create(1, 2, 3), Lists.create(1, 2, 3)));

        assertThrows(AssertEqualityException.class, () -> Asserts.equal(null, new Object()));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new Object(), null));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal("Text1", "Text2"));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(Lists.create(1, 2, 3), Lists.create(3, 2, 1)));

        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(true, "text"));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(true, 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(false, 0));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal('s', "s"));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(1, "1"));

        // Boolean - Boolean
        assertDoesNotThrow(() -> Asserts.equal(true, true));
        assertDoesNotThrow(() -> Asserts.equal(false, false));
        assertDoesNotThrow(() -> Asserts.equal(true, Boolean.TRUE));
        assertDoesNotThrow(() -> Asserts.equal(false, Boolean.FALSE));
        assertDoesNotThrow(() -> Asserts.equal(Boolean.TRUE, Boolean.TRUE));

        assertThrows(AssertEqualityException.class, () -> Asserts.equal(true, false));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(false, true));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(true, Boolean.FALSE));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(false, Boolean.TRUE));

        // Char - Char
        assertDoesNotThrow(() -> Asserts.equal((char) 0, (char) 0));
        assertDoesNotThrow(() -> Asserts.equal((char) 1, (char) 1));
        assertDoesNotThrow(() -> Asserts.equal('A', 'A'));
        assertDoesNotThrow(() -> Asserts.equal('Я', 'Я'));
        assertDoesNotThrow(() -> Asserts.equal('Z', Character.valueOf('Z')));
        assertDoesNotThrow(() -> Asserts.equal(Character.valueOf('Z'), 'Z'));
        assertDoesNotThrow(() -> Asserts.equal(Character.valueOf('Z'), Character.valueOf('Z')));

        assertThrows(AssertEqualityException.class, () -> Asserts.equal((char) 0, (char) 1));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal('A', 'B'));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal('Y', Character.valueOf('Z')));

        // Number - Number
        assertDoesNotThrow(() -> Asserts.equal(0, 0));
        assertDoesNotThrow(() -> Asserts.equal((byte) 1, (byte) 1));
        assertDoesNotThrow(() -> Asserts.equal((byte) 10, Byte.valueOf((byte) 10)));
        assertDoesNotThrow(() -> Asserts.equal(Byte.valueOf((byte) 100), (byte) 100));
        assertDoesNotThrow(() -> Asserts.equal(Byte.valueOf((byte) -1), Byte.valueOf((byte) -1)));
        assertDoesNotThrow(() -> Asserts.equal((short) 1, (short) 1));
        assertDoesNotThrow(() -> Asserts.equal((short) 10, Short.valueOf((short) 10)));
        assertDoesNotThrow(() -> Asserts.equal(Short.valueOf((short) 100), (short) 100));
        assertDoesNotThrow(() -> Asserts.equal(Short.valueOf((short) 1000), Short.valueOf((short) 1000)));
        assertDoesNotThrow(() -> Asserts.equal(1, 1));
        assertDoesNotThrow(() -> Asserts.equal(10, Integer.valueOf(10)));
        assertDoesNotThrow(() -> Asserts.equal(Integer.valueOf(100), 100));
        assertDoesNotThrow(() -> Asserts.equal(Integer.valueOf(1000), Integer.valueOf(1000)));
        assertDoesNotThrow(() -> Asserts.equal(1L, 1L));
        assertDoesNotThrow(() -> Asserts.equal(10L, Long.valueOf(10L)));
        assertDoesNotThrow(() -> Asserts.equal(Long.valueOf(100L), 100L));
        assertDoesNotThrow(() -> Asserts.equal(Long.valueOf(1000L), Long.valueOf(1000L)));
        assertDoesNotThrow(() -> Asserts.equal(0.5f, 0.5f));
        assertDoesNotThrow(() -> Asserts.equal(-0.5f, Float.valueOf(-0.5f)));
        assertDoesNotThrow(() -> Asserts.equal(Float.valueOf(0f), 0f));
        assertDoesNotThrow(() -> Asserts.equal(Float.valueOf(0f), Float.valueOf(0f)));
        assertDoesNotThrow(() -> Asserts.equal(0.5, 0.5));
        assertDoesNotThrow(() -> Asserts.equal(-0.5, Double.valueOf(-0.5)));
        assertDoesNotThrow(() -> Asserts.equal(Double.valueOf(5.0), 5.0));
        assertDoesNotThrow(() -> Asserts.equal(Double.valueOf(50.0), Double.valueOf(50.0)));

        assertThrows(AssertEqualityException.class, () -> Asserts.equal(null, (byte) 0));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal((byte) 0, null));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal((byte) 1, (byte) 2));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal((byte) 10, Byte.valueOf((byte) 20)));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(Byte.valueOf((byte) 100), (byte) 200));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(Byte.valueOf((byte) -1), Byte.valueOf((byte) -2)));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(null, (short) 0));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal((short) 0, null));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal((short) 1, (short) 2));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal((short) 10, Short.valueOf((short) 20)));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(Short.valueOf((short) 100), (short) 200));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(Short.valueOf((short) 1000), Short.valueOf((short) 2000)));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(null, 0));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(0, null));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(1, 2));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(10, Integer.valueOf(20)));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(Integer.valueOf(100), 200));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(Integer.valueOf(1000), Integer.valueOf(2000)));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(null, 0L));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(0L, null));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(1L, 2L));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(10L, Long.valueOf(20L)));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(Long.valueOf(100L), 200L));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(Long.valueOf(1000L), Long.valueOf(2000L)));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(null, 0f));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(0f, null));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(0.5f, -0.5f));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(-0.5f, Float.valueOf(0.5f)));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(Float.valueOf(0f), 1f));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(Float.valueOf(0f), Float.valueOf(1f)));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(null, 0.0));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(0.0, null));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(0.5, -0.5));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(-0.5, Double.valueOf(0.5)));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(Double.valueOf(5.0), -5.0));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(Double.valueOf(50.0), Double.valueOf(-50.0)));

        assertThrows(AssertIncomparableException.class, () -> Asserts.equal((byte) 1, (short) 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal((byte) 1, 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal((byte) 1, 1L));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal((byte) 1, 1f));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal((byte) 1, 1.0));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(1, (byte) 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(1, (short) 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(1, 1L));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(1, 1f));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(1, 1.0));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(1L, (byte) 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(1L, (short) 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(1L, 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(1L, 1f));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(1L, 1.0));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(1f, (byte) 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(1f, (short) 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(1f, 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(1f, 1L));
        assertThrows(AssertIncomparableException.class, () -> Asserts.equal(1f, 1.0));

        // bool[] - bool[]
        assertDoesNotThrow(() -> Asserts.equal(new boolean[0], new boolean[0]));
        assertDoesNotThrow(() -> Asserts.equal(new boolean[]{false}, new boolean[]{false}));
        assertDoesNotThrow(() -> Asserts.equal(new boolean[]{true, false}, new boolean[]{true, false}));

        assertThrows(AssertEqualityException.class, () -> Asserts.equal(null, new boolean[]{false}));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new boolean[]{true}, null));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new boolean[]{true}, new boolean[]{false}));

        // byte[] - byte[]
        assertDoesNotThrow(() -> Asserts.equal(new byte[0], new byte[0]));
        assertDoesNotThrow(() -> Asserts.equal(new byte[]{0}, new byte[]{0}));
        assertDoesNotThrow(() -> Asserts.equal(new byte[]{1, 2, 3}, new byte[]{1, 2, 3}));

        assertThrows(AssertEqualityException.class, () -> Asserts.equal(null, new byte[]{0}));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new byte[]{0}, null));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new byte[]{1, 2}, new byte[]{1, 2, 3}));

        // char[] - char[]
        assertDoesNotThrow(() -> Asserts.equal(new char[0], new char[0]));
        assertDoesNotThrow(() -> Asserts.equal(new char[]{0}, new char[]{0}));
        assertDoesNotThrow(() -> Asserts.equal(new char[]{1, 2, 3}, new char[]{1, 2, 3}));

        assertThrows(AssertEqualityException.class, () -> Asserts.equal(null, new char[]{0}));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new char[]{0}, null));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new char[]{1, 2}, new char[]{1, 2, 3}));

        // short[] - short[]
        assertDoesNotThrow(() -> Asserts.equal(new short[0], new short[0]));
        assertDoesNotThrow(() -> Asserts.equal(new short[]{0}, new short[]{0}));
        assertDoesNotThrow(() -> Asserts.equal(new short[]{1, 2, 3}, new short[]{1, 2, 3}));

        assertThrows(AssertEqualityException.class, () -> Asserts.equal(null, new short[]{0}));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new short[]{0}, null));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new short[]{1, 2}, new short[]{1, 2, 3}));

        // int[] - int[]
        assertDoesNotThrow(() -> Asserts.equal(new int[0], new int[0]));
        assertDoesNotThrow(() -> Asserts.equal(new int[]{0}, new int[]{0}));
        assertDoesNotThrow(() -> Asserts.equal(new int[]{1, 2, 3}, new int[]{1, 2, 3}));

        assertThrows(AssertEqualityException.class, () -> Asserts.equal(null, new int[]{0}));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new int[]{0}, null));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new int[]{1, 2}, new int[]{1, 2, 3}));

        // long[] - long[]
        assertDoesNotThrow(() -> Asserts.equal(new long[0], new long[0]));
        assertDoesNotThrow(() -> Asserts.equal(new long[]{0}, new long[]{0}));
        assertDoesNotThrow(() -> Asserts.equal(new long[]{1, 2, 3}, new long[]{1, 2, 3}));

        assertThrows(AssertEqualityException.class, () -> Asserts.equal(null, new long[]{0}));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new long[]{0}, null));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new long[]{1, 2}, new long[]{1, 2, 3}));

        // float[] - float[]
        assertDoesNotThrow(() -> Asserts.equal(new float[0], new float[0]));
        assertDoesNotThrow(() -> Asserts.equal(new float[]{0}, new float[]{0}));
        assertDoesNotThrow(() -> Asserts.equal(new float[]{1, 2, 3}, new float[]{1, 2, 3}));

        assertThrows(AssertEqualityException.class, () -> Asserts.equal(null, new float[]{0}));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new float[]{0}, null));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new float[]{1, 2}, new float[]{1, 2, 3}));

        // double[] - double[]
        assertDoesNotThrow(() -> Asserts.equal(new double[0], new double[0]));
        assertDoesNotThrow(() -> Asserts.equal(new double[]{0}, new double[]{0}));
        assertDoesNotThrow(() -> Asserts.equal(new double[]{1, 2, 3}, new double[]{1, 2, 3}));

        assertThrows(AssertEqualityException.class, () -> Asserts.equal(null, new double[]{0}));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new double[]{0}, null));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new double[]{1, 2}, new double[]{1, 2, 3}));

        // Object[] - Object[]
        assertDoesNotThrow(() -> Asserts.equal((Object[]) null, null));
        assertDoesNotThrow(() -> Asserts.equal(new Object[0], new Object[0]));
        assertDoesNotThrow(() -> Asserts.equal(new Object[]{null, null}, new Object[]{null, null}));
        assertDoesNotThrow(() -> Asserts.equal(new Boolean[]{true, false}, new Boolean[]{true, false}));
        assertDoesNotThrow(() -> Asserts.equal(new Character[]{'A', 'B', 'C'}, new Character[]{'A', 'B', 'C'}));
        assertDoesNotThrow(() -> Asserts.equal(new Integer[]{1, 2, 3}, new Integer[]{1, 2, 3}));
        assertDoesNotThrow(() -> Asserts.equal(new String[]{"S1", "S2"}, new String[]{"S1", "S2"}));

        assertThrows(AssertEqualityException.class, () -> Asserts.equal(null, new Object[0]));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new Object[0], null));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new Boolean[]{true}, new Boolean[]{false}));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new Character[]{'A', 'B', 'C'}, new Character[]{'A', 'B', 'X'}));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new Integer[]{1, 2, 3}, new Integer[]{1, 2}));
        assertThrows(AssertEqualityException.class, () -> Asserts.equal(new String[]{"S1"}, new String[]{"S2"}));
    }

    @Test
    @SuppressWarnings("UnnecessaryBoxing")
    public void testNotEqual() {
        // Object - Object
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual((Object) null, null));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual("Text", "Text"));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(Lists.create(1, 2, 3), Lists.create(1, 2, 3)));

        assertDoesNotThrow(() -> Asserts.notEqual(null, new Object()));
        assertDoesNotThrow(() -> Asserts.notEqual(new Object(), null));
        assertDoesNotThrow(() -> Asserts.notEqual("Text1", "Text2"));
        assertDoesNotThrow(() -> Asserts.notEqual(Lists.create(1, 2, 3), Lists.create(3, 2, 1)));

        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(true, "text"));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(true, 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(false, 0));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual('s', "s"));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(1, "1"));

        // Boolean - Boolean
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(true, true));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(false, false));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(true, Boolean.TRUE));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(false, Boolean.FALSE));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(Boolean.TRUE, Boolean.TRUE));

        assertDoesNotThrow(() -> Asserts.notEqual(true, false));
        assertDoesNotThrow(() -> Asserts.notEqual(false, true));
        assertDoesNotThrow(() -> Asserts.notEqual(true, Boolean.FALSE));
        assertDoesNotThrow(() -> Asserts.notEqual(false, Boolean.TRUE));

        // Char - Char
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual((char) 0, (char) 0));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual((char) 1, (char) 1));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual('A', 'A'));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual('Я', 'Я'));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual('Z', Character.valueOf('Z')));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(Character.valueOf('Z'), 'Z'));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(Character.valueOf('Z'), Character.valueOf('Z')));

        assertDoesNotThrow(() -> Asserts.notEqual((char) 0, (char) 1));
        assertDoesNotThrow(() -> Asserts.notEqual('A', 'B'));
        assertDoesNotThrow(() -> Asserts.notEqual('Y', Character.valueOf('Z')));

        // Number - Number
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(0, 0));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual((byte) 1, (byte) 1));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual((byte) 10, Byte.valueOf((byte) 10)));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(Byte.valueOf((byte) 100), (byte) 100));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(Byte.valueOf((byte) -1), Byte.valueOf((byte) -1)));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual((short) 1, (short) 1));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual((short) 10, Short.valueOf((short) 10)));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(Short.valueOf((short) 100), (short) 100));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(Short.valueOf((short) 1000), Short.valueOf((short) 1000)));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(1, 1));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(10, Integer.valueOf(10)));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(Integer.valueOf(100), 100));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(Integer.valueOf(1000), Integer.valueOf(1000)));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(1L, 1L));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(10L, Long.valueOf(10L)));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(Long.valueOf(100L), 100L));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(Long.valueOf(1000L), Long.valueOf(1000L)));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(0.5f, 0.5f));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(-0.5f, Float.valueOf(-0.5f)));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(Float.valueOf(0f), 0f));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(Float.valueOf(0f), Float.valueOf(0f)));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(0.5, 0.5));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(-0.5, Double.valueOf(-0.5)));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(Double.valueOf(5.0), 5.0));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(Double.valueOf(50.0), Double.valueOf(50.0)));

        assertDoesNotThrow(() -> Asserts.notEqual(null, (byte) 0));
        assertDoesNotThrow(() -> Asserts.notEqual((byte) 0, null));
        assertDoesNotThrow(() -> Asserts.notEqual((byte) 1, (byte) 2));
        assertDoesNotThrow(() -> Asserts.notEqual((byte) 10, Byte.valueOf((byte) 20)));
        assertDoesNotThrow(() -> Asserts.notEqual(Byte.valueOf((byte) 100), (byte) 200));
        assertDoesNotThrow(() -> Asserts.notEqual(Byte.valueOf((byte) -1), Byte.valueOf((byte) -2)));
        assertDoesNotThrow(() -> Asserts.notEqual(null, (short) 0));
        assertDoesNotThrow(() -> Asserts.notEqual((short) 0, null));
        assertDoesNotThrow(() -> Asserts.notEqual((short) 1, (short) 2));
        assertDoesNotThrow(() -> Asserts.notEqual((short) 10, Short.valueOf((short) 20)));
        assertDoesNotThrow(() -> Asserts.notEqual(Short.valueOf((short) 100), (short) 200));
        assertDoesNotThrow(() -> Asserts.notEqual(Short.valueOf((short) 1000), Short.valueOf((short) 2000)));
        assertDoesNotThrow(() -> Asserts.notEqual(null, 0));
        assertDoesNotThrow(() -> Asserts.notEqual(0, null));
        assertDoesNotThrow(() -> Asserts.notEqual(1, 2));
        assertDoesNotThrow(() -> Asserts.notEqual(10, Integer.valueOf(20)));
        assertDoesNotThrow(() -> Asserts.notEqual(Integer.valueOf(100), 200));
        assertDoesNotThrow(() -> Asserts.notEqual(Integer.valueOf(1000), Integer.valueOf(2000)));
        assertDoesNotThrow(() -> Asserts.notEqual(null, 0L));
        assertDoesNotThrow(() -> Asserts.notEqual(0L, null));
        assertDoesNotThrow(() -> Asserts.notEqual(1L, 2L));
        assertDoesNotThrow(() -> Asserts.notEqual(10L, Long.valueOf(20L)));
        assertDoesNotThrow(() -> Asserts.notEqual(Long.valueOf(100L), 200L));
        assertDoesNotThrow(() -> Asserts.notEqual(Long.valueOf(1000L), Long.valueOf(2000L)));
        assertDoesNotThrow(() -> Asserts.notEqual(null, 0f));
        assertDoesNotThrow(() -> Asserts.notEqual(0f, null));
        assertDoesNotThrow(() -> Asserts.notEqual(0.5f, -0.5f));
        assertDoesNotThrow(() -> Asserts.notEqual(-0.5f, Float.valueOf(0.5f)));
        assertDoesNotThrow(() -> Asserts.notEqual(Float.valueOf(0f), 1f));
        assertDoesNotThrow(() -> Asserts.notEqual(Float.valueOf(0f), Float.valueOf(1f)));
        assertDoesNotThrow(() -> Asserts.notEqual(null, 0.0));
        assertDoesNotThrow(() -> Asserts.notEqual(0.0, null));
        assertDoesNotThrow(() -> Asserts.notEqual(0.5, -0.5));
        assertDoesNotThrow(() -> Asserts.notEqual(-0.5, Double.valueOf(0.5)));
        assertDoesNotThrow(() -> Asserts.notEqual(Double.valueOf(5.0), -5.0));
        assertDoesNotThrow(() -> Asserts.notEqual(Double.valueOf(50.0), Double.valueOf(-50.0)));

        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual((byte) 1, (short) 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual((byte) 1, 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual((byte) 1, 1L));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual((byte) 1, 1f));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual((byte) 1, 1.0));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(1, (byte) 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(1, (short) 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(1, 1L));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(1, 1f));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(1, 1.0));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(1L, (byte) 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(1L, (short) 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(1L, 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(1L, 1f));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(1L, 1.0));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(1f, (byte) 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(1f, (short) 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(1f, 1));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(1f, 1L));
        assertThrows(AssertIncomparableException.class, () -> Asserts.notEqual(1f, 1.0));

        // bool[] - bool[]
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new boolean[0], new boolean[0]));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new boolean[]{false}, new boolean[]{false}));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new boolean[]{true, false}, new boolean[]{true, false}));

        assertDoesNotThrow(() -> Asserts.notEqual(null, new boolean[]{false}));
        assertDoesNotThrow(() -> Asserts.notEqual(new boolean[]{true}, null));
        assertDoesNotThrow(() -> Asserts.notEqual(new boolean[]{true}, new boolean[]{false}));

        // byte[] - byte[]
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new byte[0], new byte[0]));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new byte[]{0}, new byte[]{0}));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new byte[]{1, 2, 3}, new byte[]{1, 2, 3}));

        assertDoesNotThrow(() -> Asserts.notEqual(null, new byte[]{0}));
        assertDoesNotThrow(() -> Asserts.notEqual(new byte[]{0}, null));
        assertDoesNotThrow(() -> Asserts.notEqual(new byte[]{1, 2}, new byte[]{1, 2, 3}));

        // char[] - char[]
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new char[0], new char[0]));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new char[]{0}, new char[]{0}));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new char[]{1, 2, 3}, new char[]{1, 2, 3}));

        assertDoesNotThrow(() -> Asserts.notEqual(null, new char[]{0}));
        assertDoesNotThrow(() -> Asserts.notEqual(new char[]{0}, null));
        assertDoesNotThrow(() -> Asserts.notEqual(new char[]{1, 2}, new char[]{1, 2, 3}));

        // short[] - short[]
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new short[0], new short[0]));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new short[]{0}, new short[]{0}));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new short[]{1, 2, 3}, new short[]{1, 2, 3}));

        assertDoesNotThrow(() -> Asserts.notEqual(null, new short[]{0}));
        assertDoesNotThrow(() -> Asserts.notEqual(new short[]{0}, null));
        assertDoesNotThrow(() -> Asserts.notEqual(new short[]{1, 2}, new short[]{1, 2, 3}));

        // int[] - int[]
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new int[0], new int[0]));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new int[]{0}, new int[]{0}));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new int[]{1, 2, 3}, new int[]{1, 2, 3}));

        assertDoesNotThrow(() -> Asserts.notEqual(null, new int[]{0}));
        assertDoesNotThrow(() -> Asserts.notEqual(new int[]{0}, null));
        assertDoesNotThrow(() -> Asserts.notEqual(new int[]{1, 2}, new int[]{1, 2, 3}));

        // long[] - long[]
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new long[0], new long[0]));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new long[]{0}, new long[]{0}));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new long[]{1, 2, 3}, new long[]{1, 2, 3}));

        assertDoesNotThrow(() -> Asserts.notEqual(null, new long[]{0}));
        assertDoesNotThrow(() -> Asserts.notEqual(new long[]{0}, null));
        assertDoesNotThrow(() -> Asserts.notEqual(new long[]{1, 2}, new long[]{1, 2, 3}));

        // float[] - float[]
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new float[0], new float[0]));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new float[]{0}, new float[]{0}));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new float[]{1, 2, 3}, new float[]{1, 2, 3}));

        assertDoesNotThrow(() -> Asserts.notEqual(null, new float[]{0}));
        assertDoesNotThrow(() -> Asserts.notEqual(new float[]{0}, null));
        assertDoesNotThrow(() -> Asserts.notEqual(new float[]{1, 2}, new float[]{1, 2, 3}));

        // double[] - double[]
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new double[0], new double[0]));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new double[]{0}, new double[]{0}));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new double[]{1, 2, 3}, new double[]{1, 2, 3}));

        assertDoesNotThrow(() -> Asserts.notEqual(null, new double[]{0}));
        assertDoesNotThrow(() -> Asserts.notEqual(new double[]{0}, null));
        assertDoesNotThrow(() -> Asserts.notEqual(new double[]{1, 2}, new double[]{1, 2, 3}));

        // Object[] - Object[]
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual((Object[]) null, null));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new Object[0], new Object[0]));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new Object[]{null, null}, new Object[]{null, null}));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new Boolean[]{true, false}, new Boolean[]{true, false}));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new Character[]{'A', 'B', 'C'}, new Character[]{'A', 'B', 'C'}));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new Integer[]{1, 2, 3}, new Integer[]{1, 2, 3}));
        assertThrows(AssertEqualityException.class, () -> Asserts.notEqual(new String[]{"S1", "S2"}, new String[]{"S1", "S2"}));

        assertDoesNotThrow(() -> Asserts.notEqual(null, new Object[0]));
        assertDoesNotThrow(() -> Asserts.notEqual(new Object[0], null));
        assertDoesNotThrow(() -> Asserts.notEqual(new Boolean[]{true}, new Boolean[]{false}));
        assertDoesNotThrow(() -> Asserts.notEqual(new Character[]{'A', 'B', 'C'}, new Character[]{'A', 'B', 'X'}));
        assertDoesNotThrow(() -> Asserts.notEqual(new Integer[]{1, 2, 3}, new Integer[]{1, 2}));
        assertDoesNotThrow(() -> Asserts.notEqual(new String[]{"S1"}, new String[]{"S2"}));
    }
}