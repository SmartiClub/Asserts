package club.smarti.asserts.exceptions;

import club.smarti.asserts.exceptions.base.AssertException;

public class AssertEqualityException extends AssertException {

    /**
     * General constructor
     */
    public AssertEqualityException(Object... debugInfo) {
        super(debugInfo);
    }
}