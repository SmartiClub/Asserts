package club.smarti.asserts.exceptions;

import club.smarti.asserts.exceptions.base.AssertException;

public class AssertIndexException extends AssertException {

    /**
     * General constructor
     */
    public AssertIndexException(Object... debugInfo) {
        super(debugInfo);
    }
}