package club.smarti.asserts.exceptions;

import club.smarti.asserts.exceptions.base.AssertException;

public class AssertIncomparableException extends AssertException {

    /**
     * General constructor
     */
    public AssertIncomparableException(Object... debugInfo) {
        super(debugInfo);
    }
}