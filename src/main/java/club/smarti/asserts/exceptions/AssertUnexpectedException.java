package club.smarti.asserts.exceptions;

import club.smarti.asserts.exceptions.base.AssertException;

public class AssertUnexpectedException extends AssertException {

    /**
     * General constructor
     */
    public AssertUnexpectedException(Object... debugInfo) {
        super(debugInfo);
    }
}