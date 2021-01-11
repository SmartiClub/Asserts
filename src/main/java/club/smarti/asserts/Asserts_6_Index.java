package club.smarti.asserts;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

import club.smarti.asserts.exceptions.AssertIndexException;
import club.smarti.asserts.exceptions.AssertKeyException;
import club.smarti.asserts.interfaces.HasIndex;

abstract class Asserts_6_Index extends Asserts_5_Class {

    /**
     * Assert that the index is valid for the array
     *
     * @param index - index to verify
     * @param array - target array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "_, null, _ -> fail")
    public static void index(int index, boolean[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, index, debugInfo);
            if (index < 0 || index >= array.length) {
                throwIt(new AssertIndexException(index, array, debugInfo));
            }
        }
    }

    /**
     * Assert that the index is valid for the array
     *
     * @param index - index to verify
     * @param array - target array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "_, null, _ -> fail")
    public static void index(int index, byte[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, index, debugInfo);
            if (index < 0 || index >= array.length) {
                throwIt(new AssertIndexException(index, array, debugInfo));
            }
        }
    }

    /**
     * Assert that the index is valid for the array
     *
     * @param index - index to verify
     * @param array - target array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "_, null, _ -> fail")
    public static void index(int index, char[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, index, debugInfo);
            if (index < 0 || index >= array.length) {
                throwIt(new AssertIndexException(index, array, debugInfo));
            }
        }
    }

    /**
     * Assert that the index is valid for the array
     *
     * @param index - index to verify
     * @param array - target array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "_, null, _ -> fail")
    public static void index(int index, short[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, index, debugInfo);
            if (index < 0 || index >= array.length) {
                throwIt(new AssertIndexException(index, array, debugInfo));
            }
        }
    }

    /**
     * Assert that the index is valid for the array
     *
     * @param index - index to verify
     * @param array - target array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "_, null, _ -> fail")
    public static void index(int index, int[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, index, debugInfo);
            if (index < 0 || index >= array.length) {
                throwIt(new AssertIndexException(index, array, debugInfo));
            }
        }
    }

    /**
     * Assert that the index is valid for the array
     *
     * @param index - index to verify
     * @param array - target array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "_, null, _ -> fail")
    public static void index(int index, long[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, index, debugInfo);
            if (index < 0 || index >= array.length) {
                throwIt(new AssertIndexException(index, array, debugInfo));
            }
        }
    }

    /**
     * Assert that the index is valid for the array
     *
     * @param index - index to verify
     * @param array - target array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "_, null, _ -> fail")
    public static void index(int index, float[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, index, debugInfo);
            if (index < 0 || index >= array.length) {
                throwIt(new AssertIndexException(index, array, debugInfo));
            }
        }
    }

    /**
     * Assert that the index is valid for the array
     *
     * @param index - index to verify
     * @param array - target array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "_, null, _ -> fail")
    public static void index(int index, double[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, index, debugInfo);
            if (index < 0 || index >= array.length) {
                throwIt(new AssertIndexException(index, array, debugInfo));
            }
        }
    }

    /**
     * Assert that the index is valid for the array
     *
     * @param index - index to verify
     * @param array - target array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "_, null, _ -> fail")
    public static void index(int index, Object[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, index, debugInfo);
            if (index < 0 || index >= array.length) {
                throwIt(new AssertIndexException(index, array, debugInfo));
            }
        }
    }

    /**
     * Assert that the index is valid for the list
     *
     * @param index - index to verify
     * @param list - target list
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "_, null, _ -> fail")
    public static void index(int index, List<?> list, Object... debugInfo) {
        if (ENABLED) {
            notNull(list, index, debugInfo);
            if (index < 0 || index >= list.size()) {
                throwIt(new AssertIndexException(index, list, debugInfo));
            }
        }
    }

    /**
     * Assert that the index is valid for the dataset
     *
     * @param index - index to verify
     * @param indexable - target structure
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "_, null, _ -> fail")
    public static void index(int index, HasIndex indexable, Object... debugInfo) {
        if (ENABLED) {
            notNull(indexable, index, debugInfo);
            if (index < 0 || index >= indexable.size()) {
                throwIt(new AssertIndexException(index, indexable, debugInfo));
            }
        }
    }

    /**
     * Assert that the key is valid for the map
     *
     * @param key - key to verify
     * @param map - target map
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "_, null, _ -> fail")
    public static void key(@Nullable Object key, Map<?, ?> map, Object... debugInfo) {
        if (ENABLED) {
            notNull(map, key, debugInfo);
            if (!map.containsKey(key)) {
                throwIt(new AssertKeyException(key, map, debugInfo));
            }
        }
    }
}