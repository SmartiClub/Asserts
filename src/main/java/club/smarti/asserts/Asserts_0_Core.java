package club.smarti.asserts;

import org.jetbrains.annotations.Contract;

import club.smarti.asserts.exceptions.base.AssertException;

abstract class Asserts_0_Core {

    protected static boolean ENABLED = true;

    /**
     * Turn the asserts ON and OFF
     *
     * @param enabled - on/off flag
     */
    public static void setEnabled(boolean enabled) {
        ENABLED = enabled;
    }

    /**
     * Throws the exception
     * Single place for breakpoint location
     *
     * @param error - the exception to be thrown
     */
    @Contract(pure = true, value = "_ -> fail")
    protected static void throwIt(AssertException error) {
        if (ENABLED) {
            throw error;
        }
    }
}