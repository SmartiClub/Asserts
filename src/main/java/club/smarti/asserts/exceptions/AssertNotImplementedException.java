package club.smarti.asserts.exceptions;

import club.smarti.asserts.exceptions.base.AssertException;

public class AssertNotImplementedException extends AssertException {

    /**
     * General constructor
     */
    public AssertNotImplementedException(Object... debugInfo) {
        super(debugInfo);
    }
}