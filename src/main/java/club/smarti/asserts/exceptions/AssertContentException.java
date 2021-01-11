package club.smarti.asserts.exceptions;

import club.smarti.asserts.exceptions.base.AssertException;

public class AssertContentException extends AssertException {

    /**
     * General constructor
     */
    public AssertContentException(Object... debugInfo) {
        super(debugInfo);
    }
}