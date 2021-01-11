import org.junit.jupiter.api.Test;

import club.smarti.asserts.Asserts;
import club.smarti.asserts.exceptions.AssertNotAllowedException;
import club.smarti.asserts.exceptions.AssertNotApplicableException;
import club.smarti.asserts.exceptions.AssertNotFoundException;
import club.smarti.asserts.exceptions.AssertNotImplementedException;
import club.smarti.asserts.exceptions.AssertUnexpectedException;
import club.smarti.asserts.exceptions.AssertUnsupportedException;
import club.smarti.asserts.exceptions.base.AssertException;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SuppressWarnings("Convert2MethodRef")
public class TestCommon {

    @Test
    public void testFail() {
        assertThrows(AssertException.class, () -> Asserts.fail());
    }

    @Test
    public void testNotFound() {
        assertThrows(AssertNotFoundException.class, () -> Asserts.notFound());
    }

    @Test
    public void testNotImplemented() {
        assertThrows(AssertNotImplementedException.class, () -> Asserts.notImplemented());
    }

    @Test
    public void testNotApplicable() {
        assertThrows(AssertNotApplicableException.class, () -> Asserts.notApplicable());
    }

    @Test
    public void testNotAllowed() {
        assertThrows(AssertNotAllowedException.class, () -> Asserts.notAllowed());
    }

    @Test
    public void testUnsupported() {
        assertThrows(AssertUnsupportedException.class, () -> Asserts.unsupported());
    }

    @Test
    public void testUnexpected() {
        assertThrows(AssertUnexpectedException.class, () -> Asserts.unexpected());
    }
}