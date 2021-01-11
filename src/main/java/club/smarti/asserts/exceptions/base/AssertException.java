package club.smarti.asserts.exceptions.base;

import club.smarti.asserts.Asserts;
import club.smarti.java.StackTrace;
import club.smarti.readable.Readable;

/**
 * Modified RuntimeException
 * *
 * Advantages:
 * – shorter stack trace
 */
public abstract class AssertException extends RuntimeException {

    // Note: be aware of obfuscation tools
    private final static String PKG_NAME;

    static {
        Package pkg = Asserts.class.getPackage();
        if (pkg != null) {
            PKG_NAME = pkg.getName();
        }
        else {
            PKG_NAME = "unknown";
        }
    }

    /**
     * General constructor
     */
    public AssertException(Object... debugInfo) {
        super(Readable.toString(debugInfo));

        StackTraceElement[] stack = StackTrace.getCurrent();
        stack = StackTrace.removePackage(stack, PKG_NAME);
        setStackTrace(stack);
    }
}