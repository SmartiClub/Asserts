package club.smarti.asserts.exceptions;

import club.smarti.asserts.exceptions.base.AssertException;

public class AssertNotAllowedException extends AssertException {

    /**
     * General constructor
     */
    public AssertNotAllowedException(Object... debugInfo) {
        super(debugInfo);
    }
}