package club.smarti.asserts;

import org.jetbrains.annotations.Contract;

import club.smarti.asserts.exceptions.AssertConditionException;

abstract class Asserts_2_Condition extends Asserts_1_Null {

    /**
     * Assert that the condition is true
     *
     * @param condition - condition to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "false, _ -> fail")
    public static void isTrue(boolean condition, Object... debugInfo) {
        if (ENABLED) {
            if (!condition) {
                throwIt(new AssertConditionException(debugInfo));
            }
        }
    }

    /**
     * Assert that the condition is false
     *
     * @param condition - condition to verify
     * @param debugInfo - optional list of debug data
     */
    @Contract(pure = true, value = "true, _ -> fail")
    public static void isFalse(boolean condition, Object... debugInfo) {
        if (ENABLED) {
            if (condition) {
                throwIt(new AssertConditionException(debugInfo));
            }
        }
    }
}