package club.smarti.asserts;

import org.jetbrains.annotations.Contract;

import java.util.List;
import java.util.Map;
import java.util.Set;

import club.smarti.asserts.exceptions.AssertEmptyCheckException;

abstract class Asserts_3_Empty extends Asserts_2_Condition {

    /**
     * Assert that the array is not empty
     *
     * @param array - array to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void notEmpty(boolean[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, debugInfo);
            if (array.length == 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the array is not empty
     *
     * @param array - array to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void notEmpty(byte[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, debugInfo);
            if (array.length == 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the array is not empty
     *
     * @param array - array to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void notEmpty(char[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, debugInfo);
            if (array.length == 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the array is not empty
     *
     * @param array - array to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void notEmpty(short[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, debugInfo);
            if (array.length == 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the array is not empty
     *
     * @param array - array to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void notEmpty(int[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, debugInfo);
            if (array.length == 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the array is not empty
     *
     * @param array - array to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void notEmpty(long[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, debugInfo);
            if (array.length == 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the array is not empty
     *
     * @param array - array to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void notEmpty(float[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, debugInfo);
            if (array.length == 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the array is not empty
     *
     * @param array - array to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void notEmpty(double[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, debugInfo);
            if (array.length == 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the array is not empty
     *
     * @param array - array to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void notEmpty(Object[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, debugInfo);
            if (array.length == 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the list is not empty
     *
     * @param list - list to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void notEmpty(List<?> list, Object... debugInfo) {
        notNull(list, debugInfo);
        if (list.size() == 0) {
            throwIt(new AssertEmptyCheckException(debugInfo));
        }
    }

    /**
     * Assert that the set is not empty
     *
     * @param set - set to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void notEmpty(Set<?> set, Object... debugInfo) {
        if (ENABLED) {
            notNull(set, debugInfo);
            if (set.size() == 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the map is not empty
     *
     * @param map - map to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void notEmpty(Map<?, ?> map, Object... debugInfo) {
        if (ENABLED) {
            notNull(map, debugInfo);
            if (map.size() == 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the string is not empty
     *
     * @param str - string to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void notEmpty(String str, Object... debugInfo) {
        if (ENABLED) {
            notNull(str, debugInfo);
            if (str.length() == 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the array is empty
     *
     * @param array - array to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void empty(boolean[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, debugInfo);
            if (array.length != 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the array is empty
     *
     * @param array - array to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void empty(byte[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, debugInfo);
            if (array.length != 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the array is empty
     *
     * @param array - array to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void empty(char[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, debugInfo);
            if (array.length != 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the array is empty
     *
     * @param array - array to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void empty(short[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, debugInfo);
            if (array.length != 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the array is empty
     *
     * @param array - array to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void empty(int[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, debugInfo);
            if (array.length != 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the array is empty
     *
     * @param array - array to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void empty(long[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, debugInfo);
            if (array.length != 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the array is empty
     *
     * @param array - array to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void empty(float[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, debugInfo);
            if (array.length != 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the array is empty
     *
     * @param array - array to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void empty(double[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, debugInfo);
            if (array.length != 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the array is empty
     *
     * @param array - array to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void empty(Object[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, debugInfo);
            if (array.length != 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the list is empty
     *
     * @param list - list to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void empty(List<?> list, Object... debugInfo) {
        if (ENABLED) {
            notNull(list, debugInfo);
            if (list.size() != 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the set is empty
     *
     * @param set - set to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void empty(Set<?> set, Object... debugInfo) {
        if (ENABLED) {
            notNull(set, debugInfo);
            if (set.size() != 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the map is empty
     *
     * @param map - map to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void empty(Map<?, ?> map, Object... debugInfo) {
        if (ENABLED) {
            notNull(map, debugInfo);
            if (map.size() != 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the string is empty
     *
     * @param str - string to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void empty(String str, Object... debugInfo) {
        if (ENABLED) {
            notNull(str, debugInfo);
            if (str.length() != 0) {
                throwIt(new AssertEmptyCheckException(debugInfo));
            }
        }
    }
}