package club.smarti.asserts;

import org.jetbrains.annotations.Contract;

import java.util.Arrays;

import club.smarti.asserts.exceptions.AssertEqualityException;
import club.smarti.asserts.exceptions.AssertIncomparableException;
import club.smarti.java.Classes;
import club.smarti.java.Objects;

@SuppressWarnings({"RedundantIfStatement", "ConstantConditions"})
abstract class Asserts_4_Equal extends Asserts_3_Empty {

    /**
     * Assert that the objects are equal
     *
     * @param a - first object
     * @param b - second object
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, !null, _ -> fail; !null, null, _ -> fail")
    public static void equal(Object a, Object b, Object... debugInfo) {
        if (ENABLED) {
            if (!checkComparable(a, b)) {
                throwIt(new AssertIncomparableException(a.getClass(), a, b.getClass(), b, debugInfo));
            }
            if (!checkEqual(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the boolean values are equal
     *
     * @param a - first value
     * @param b - second value
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true)
    public static void equal(Boolean a, Boolean b, Object... debugInfo) {
        if (ENABLED) {
            if (!checkEqual(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the characters are equal
     *
     * @param a - first value
     * @param b - second value
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true)
    public static void equal(Character a, Character b, Object... debugInfo) {
        if (ENABLED) {
            if (!checkEqual(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the numbers are equal
     *
     * @param a - first value
     * @param b - second value
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, !null, _ -> fail; !null, null, _ -> fail")
    public static void equal(Number a, Number b, Object... debugInfo) {
        if (ENABLED) {
            if (!checkComparable(a, b)) {
                throwIt(new AssertIncomparableException(a.getClass(), a, b.getClass(), b, debugInfo));
            }
            if (!checkEqual(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the arrays are equal
     *
     * @param a - first array
     * @param b - second array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, !null, _ -> fail; !null, null, _ -> fail")
    public static void equal(boolean[] a, boolean[] b, Object... debugInfo) {
        if (ENABLED) {
            if (!Arrays.equals(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the arrays are equal
     *
     * @param a - first array
     * @param b - second array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, !null, _ -> fail; !null, null, _ -> fail")
    public static void equal(byte[] a, byte[] b, Object... debugInfo) {
        if (ENABLED) {
            if (!Arrays.equals(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the arrays are equal
     *
     * @param a - first array
     * @param b - second array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, !null, _ -> fail; !null, null, _ -> fail")
    public static void equal(char[] a, char[] b, Object... debugInfo) {
        if (ENABLED) {
            if (!Arrays.equals(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the arrays are equal
     *
     * @param a - first array
     * @param b - second array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, !null, _ -> fail; !null, null, _ -> fail")
    public static void equal(short[] a, short[] b, Object... debugInfo) {
        if (ENABLED) {
            if (!Arrays.equals(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the arrays are equal
     *
     * @param a - first array
     * @param b - second array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, !null, _ -> fail; !null, null, _ -> fail")
    public static void equal(int[] a, int[] b, Object... debugInfo) {
        if (ENABLED) {
            if (!Arrays.equals(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the arrays are equal
     *
     * @param a - first array
     * @param b - second array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, !null, _ -> fail; !null, null, _ -> fail")
    public static void equal(long[] a, long[] b, Object... debugInfo) {
        if (ENABLED) {
            if (!Arrays.equals(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the arrays are equal
     *
     * @param a - first array
     * @param b - second array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, !null, _ -> fail; !null, null, _ -> fail")
    public static void equal(float[] a, float[] b, Object... debugInfo) {
        if (ENABLED) {
            if (!Arrays.equals(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the arrays are equal
     *
     * @param a - first array
     * @param b - second array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, !null, _ -> fail; !null, null, _ -> fail")
    public static void equal(double[] a, double[] b, Object... debugInfo) {
        if (ENABLED) {
            if (!Arrays.equals(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the arrays are equal
     *
     * @param a - first array
     * @param b - second array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, !null, _ -> fail; !null, null, _ -> fail")
    public static void equal(Object[] a, Object[] b, Object... debugInfo) {
        if (ENABLED) {
            if (!Arrays.equals(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the objects are not equal
     *
     * @param a - first object
     * @param b - second object
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, null, _ -> fail")
    public static void notEqual(Object a, Object b, Object... debugInfo) {
        if (ENABLED) {
            if (!checkComparable(a, b)) {
                throwIt(new AssertIncomparableException(a.getClass(), a, b.getClass(), b, debugInfo));
            }
            if (checkEqual(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the boolean values are not equal
     *
     * @param a - first value
     * @param b - second value
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true)
    public static void notEqual(Boolean a, Boolean b, Object... debugInfo) {
        if (ENABLED) {
            if (checkEqual(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the characters are not equal
     *
     * @param a - first value
     * @param b - second value
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true)
    public static void notEqual(Character a, Character b, Object... debugInfo) {
        if (ENABLED) {
            if (checkEqual(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the numbers are not equal
     *
     * @param a - first value
     * @param b - second value
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, null, _ -> fail")
    public static void notEqual(Number a, Number b, Object... debugInfo) {
        if (ENABLED) {
            if (!checkComparable(a, b)) {
                throwIt(new AssertIncomparableException(a.getClass(), a, b.getClass(), b, debugInfo));
            }
            if (checkEqual(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the arrays are not equal
     *
     * @param a - first array
     * @param b - second array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, null, _ -> fail")
    public static void notEqual(boolean[] a, boolean[] b, Object... debugInfo) {
        if (ENABLED) {
            if (Arrays.equals(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the arrays are not equal
     *
     * @param a - first array
     * @param b - second array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, null, _ -> fail")
    public static void notEqual(byte[] a, byte[] b, Object... debugInfo) {
        if (ENABLED) {
            if (Arrays.equals(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the arrays are not equal
     *
     * @param a - first array
     * @param b - second array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, null, _ -> fail")
    public static void notEqual(char[] a, char[] b, Object... debugInfo) {
        if (ENABLED) {
            if (Arrays.equals(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the arrays are not equal
     *
     * @param a - first array
     * @param b - second array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, null, _ -> fail")
    public static void notEqual(short[] a, short[] b, Object... debugInfo) {
        if (ENABLED) {
            if (Arrays.equals(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the arrays are not equal
     *
     * @param a - first array
     * @param b - second array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, null, _ -> fail")
    public static void notEqual(int[] a, int[] b, Object... debugInfo) {
        if (ENABLED) {
            if (Arrays.equals(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the arrays are not equal
     *
     * @param a - first array
     * @param b - second array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, null, _ -> fail")
    public static void notEqual(long[] a, long[] b, Object... debugInfo) {
        if (ENABLED) {
            if (Arrays.equals(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the arrays are not equal
     *
     * @param a - first array
     * @param b - second array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, null, _ -> fail")
    public static void notEqual(float[] a, float[] b, Object... debugInfo) {
        if (ENABLED) {
            if (Arrays.equals(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the arrays are not equal
     *
     * @param a - first array
     * @param b - second array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, null, _ -> fail")
    public static void notEqual(double[] a, double[] b, Object... debugInfo) {
        if (ENABLED) {
            if (Arrays.equals(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Assert that the arrays are not equal
     *
     * @param a - first array
     * @param b - second array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, null, _ -> fail")
    public static void notEqual(Object[] a, Object[] b, Object... debugInfo) {
        if (ENABLED) {
            if (Arrays.equals(a, b)) {
                throwIt(new AssertEqualityException(a, b, debugInfo));
            }
        }
    }

    /**
     * Inner verification method
     */
    @Contract(pure = true, value = "null, null -> true; !null, null -> false; null, !null -> false")
    private static boolean checkEqual(Object expected, Object actual) {
        return Objects.equal(expected, actual);
    }

    /**
     * Check if the objects can be compared
     */
    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    @Contract(pure = true, value = "null, _ -> true; _, null -> true")
    private static boolean checkComparable(Object a, Object b) {
        if (a != null && b != null) {
            Class<?> classA = a.getClass();
            Class<?> classB = b.getClass();
            if (strictCompare(classA) || strictCompare(classB)) {
                return classA == classB;
            }
        }
        return true;
    }

    /**
     * Check if the class requires exact matching when compared
     */
    @Contract(pure = true, value = "null -> false")
    private static boolean strictCompare(Class<?> cls) {
        if (cls != null) {
            if (cls == boolean.class || cls == Boolean.class || cls == char.class || cls == Character.class || Classes.isAssignable(Number.class, cls)) {
                return true;
            }
        }
        return false;
    }
}