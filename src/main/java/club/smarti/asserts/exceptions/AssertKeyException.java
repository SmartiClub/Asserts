package club.smarti.asserts.exceptions;

import club.smarti.asserts.exceptions.base.AssertException;

public class AssertKeyException extends AssertException {

    /**
     * General constructor
     */
    public AssertKeyException(Object... debugInfo) {
        super(debugInfo);
    }
}