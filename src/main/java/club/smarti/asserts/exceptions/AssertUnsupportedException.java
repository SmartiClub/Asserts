package club.smarti.asserts.exceptions;

import club.smarti.asserts.exceptions.base.AssertException;

public class AssertUnsupportedException extends AssertException {

    /**
     * General constructor
     */
    public AssertUnsupportedException(Object... debugInfo) {
        super(debugInfo);
    }
}