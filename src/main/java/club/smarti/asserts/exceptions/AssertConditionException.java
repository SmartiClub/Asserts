package club.smarti.asserts.exceptions;

import club.smarti.asserts.exceptions.base.AssertException;

public class AssertConditionException extends AssertException {

    /**
     * General constructor
     */
    public AssertConditionException(Object... debugInfo) {
        super(debugInfo);
    }
}