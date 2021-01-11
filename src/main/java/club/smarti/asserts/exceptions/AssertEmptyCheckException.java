package club.smarti.asserts.exceptions;

import club.smarti.asserts.exceptions.base.AssertException;

public class AssertEmptyCheckException extends AssertException {

    /**
     * General constructor
     */
    public AssertEmptyCheckException(Object... debugInfo) {
        super(debugInfo);
    }
}