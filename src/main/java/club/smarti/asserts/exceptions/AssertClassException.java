package club.smarti.asserts.exceptions;

import club.smarti.asserts.exceptions.base.AssertException;

public class AssertClassException extends AssertException {

    /**
     * General constructor
     */
    public AssertClassException(Object... debugInfo) {
        super(debugInfo);
    }
}