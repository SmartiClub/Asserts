package club.smarti.asserts.exceptions;

import club.smarti.asserts.exceptions.base.AssertException;

public class AssertNotApplicableException extends AssertException {

    /**
     * General constructor
     */
    public AssertNotApplicableException(Object... debugInfo) {
        super(debugInfo);
    }
}