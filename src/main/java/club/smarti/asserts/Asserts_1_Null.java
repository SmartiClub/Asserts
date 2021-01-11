package club.smarti.asserts;

import org.jetbrains.annotations.Contract;

import club.smarti.asserts.exceptions.AssertNullCheckException;

abstract class Asserts_1_Null extends Asserts_0_Core {

    /**
     * Assert that the object is not null
     *
     * @param obj - object to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "null, _ -> fail")
    public static void notNull(Object obj, Object... debugInfo) {
        if (ENABLED) {
            if (obj == null) {
                throwIt(new AssertNullCheckException(debugInfo));
            }
        }
    }

    /**
     * Assert that the object is null
     *
     * @param obj - object to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "!null, _ -> fail")
    public static void isNull(Object obj, Object... debugInfo) {
        if (ENABLED) {
            if (obj != null) {
                throwIt(new AssertNullCheckException(debugInfo));
            }
        }
    }
}