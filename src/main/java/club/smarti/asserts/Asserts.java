package club.smarti.asserts;

import org.jetbrains.annotations.Contract;

import club.smarti.asserts.exceptions.AssertNotAllowedException;
import club.smarti.asserts.exceptions.AssertNotApplicableException;
import club.smarti.asserts.exceptions.AssertNotFoundException;
import club.smarti.asserts.exceptions.AssertNotImplementedException;
import club.smarti.asserts.exceptions.AssertUnexpectedException;
import club.smarti.asserts.exceptions.AssertUnsupportedException;
import club.smarti.asserts.exceptions.base.AssertException;

/**
 * Assertion tools for Java project (debug, unit testing and production)
 * *
 * Advantages:
 * – wide range of methods
 * – supports debug info, processed 'on-demand'
 * – single breakpoint for all asserts
 * – provides individual exception types
 * – does not fail JUnit tests immediately, i.e. it can be caught
 * – can be turned on/off
 */
public class Asserts extends Asserts_7_Content {

    /**
     * Fail the process
     *
     * @param debugInfo - parameters to be logged
     */
    @Contract(pure = true, value = "_ -> fail")
    public static void fail(Object... debugInfo) {
        throwIt(new AssertException(debugInfo) {
        });
    }

    /**
     * Fail the process
     *
     * @param debugInfo - parameters to be logged
     */
    @Contract(pure = true, value = "_ -> fail")
    public static void notFound(Object... debugInfo) {
        throwIt(new AssertNotFoundException(debugInfo));
    }

    /**
     * Fail the process
     *
     * @param debugInfo - parameters to be logged
     */
    @Contract(pure = true, value = "_ -> fail")
    public static void notImplemented(Object... debugInfo) {
        throwIt(new AssertNotImplementedException(debugInfo));
    }

    /**
     * Fail the process
     *
     * @param debugInfo - parameters to be logged
     */
    @Contract(pure = true, value = "_ -> fail")
    public static void notApplicable(Object... debugInfo) {
        throwIt(new AssertNotApplicableException(debugInfo));
    }

    /**
     * Fail the process
     *
     * @param debugInfo - parameters to be logged
     */
    @Contract(pure = true, value = "_ -> fail")
    public static void notAllowed(Object... debugInfo) {
        throwIt(new AssertNotAllowedException(debugInfo));
    }

    /**
     * Fail the process
     *
     * @param debugInfo - parameters to be logged
     */
    @Contract(pure = true, value = "_ -> fail")
    public static void unsupported(Object... debugInfo) {
        throwIt(new AssertUnsupportedException(debugInfo));
    }

    /**
     * Fail the process
     *
     * @param debugInfo - parameters to be logged
     */
    @Contract(pure = true, value = "_ -> fail")
    public static void unexpected(Object... debugInfo) {
        throwIt(new AssertUnexpectedException(debugInfo));
    }
}