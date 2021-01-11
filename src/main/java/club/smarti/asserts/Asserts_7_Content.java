package club.smarti.asserts;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import club.smarti.asserts.exceptions.AssertContentException;
import club.smarti.java.Arrays;

abstract class Asserts_7_Content extends Asserts_6_Index {

    /**
     * Assert that the array contains the item
     *
     * @param item - item to check
     * @param array - target array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "_, null, _ -> fail")
    public static void contains(Object item, Object[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, item, debugInfo);
            if (!Arrays.contains(array, item)) {
                throwIt(new AssertContentException(item, array, debugInfo));
            }
        }
    }

    /**
     * Assert that the list contains the item
     *
     * @param item - item to check
     * @param list - target list
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "_, null, _ -> fail")
    public static void contains(Object item, List<?> list, Object... debugInfo) {
        if (ENABLED) {
            notNull(list, item, debugInfo);
            if (!list.contains(item)) {
                throwIt(new AssertContentException(item, list, debugInfo));
            }
        }
    }

    /**
     * Assert that the string contains the substring
     *
     * @param part - substring to check (regex isn't supported here)
     * @param str - target string
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _, _ -> fail; _, null, _ -> fail")
    public static void contains(String part, String str, Object... debugInfo) {
        if (ENABLED) {
            notNull(str, part, debugInfo);
            notNull(part, str, debugInfo);
            if (!str.contains(part)) {
                throwIt(new AssertContentException(part, str, debugInfo));
            }
        }
    }

    /**
     * Assert that the array doesn't contain the item
     *
     * @param item - item to check
     * @param array - target array
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "_, null, _ -> fail")
    public static void notContains(@Nullable Object item, Object[] array, Object... debugInfo) {
        if (ENABLED) {
            notNull(array, item, debugInfo);
            if (Arrays.contains(array, item)) {
                throwIt(new AssertContentException(item, array, debugInfo));
            }
        }
    }

    /**
     * Assert that the list doesn't contain the item
     *
     * @param item - item to check
     * @param list - target list
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "_, null, _ -> fail")
    public static void notContains(@Nullable Object item, List<?> list, Object... debugInfo) {
        if (ENABLED) {
            notNull(list, item, debugInfo);
            if (list.contains(item)) {
                throwIt(new AssertContentException(item, list, debugInfo));
            }
        }
    }

    /**
     * Assert that the string doesn't contain the substring
     *
     * @param part - substring to check (regex isn't supported here)
     * @param str - target string
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _, _ -> fail; _, null, _ -> fail")
    public static void notContains(String part, String str, Object... debugInfo) {
        if (ENABLED) {
            notNull(str, debugInfo);
            notNull(part, debugInfo);
            if (str.contains(part)) {
                throwIt(new AssertContentException(part, str, debugInfo));
            }
        }
    }
}