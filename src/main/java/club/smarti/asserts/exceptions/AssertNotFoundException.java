package club.smarti.asserts.exceptions;

import club.smarti.asserts.exceptions.base.AssertException;

public class AssertNotFoundException extends AssertException {

    /**
     * General constructor
     */
    public AssertNotFoundException(Object... debugInfo) {
        super(debugInfo);
    }
}