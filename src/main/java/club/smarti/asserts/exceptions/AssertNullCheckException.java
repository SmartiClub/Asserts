package club.smarti.asserts.exceptions;

import club.smarti.asserts.exceptions.base.AssertException;

public class AssertNullCheckException extends AssertException {

    /**
     * General constructor
     */
    public AssertNullCheckException(Object... debugInfo) {
        super(debugInfo);
    }
}