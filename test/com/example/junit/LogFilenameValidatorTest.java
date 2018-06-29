package com.example.junit;

import com.example.jnit.LogFilenameValidator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * LogFilenameValidator Tester.
 *
 * @author Yuji Okamoto
 * @version 1.0
 * @since <pre>May 25, 2018</pre>
 */
public class LogFilenameValidatorTest {

    private LogFilenameValidator logFilenameValidator;

    @Before
    public void before() throws Exception {
        logFilenameValidator = new LogFilenameValidator(new StubFileExtensionsManagerImpl());
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: isValidLogFilename(String filename)
     */
    @Test
    public void isValidLogFilename_shouldReturnTrue_givenValidFilename() throws Exception {
        assertTrue("Calling isValidLogFilename() with a valid filename should have returned true.",
                logFilenameValidator.isValidLogFilename("filename.txt"));
    }

    /**
     * Method: isValidLogFilename(String filename)
     */
    @Test
    public void isValidLogFilename_shouldReturnFalse_givenInvalidFilename() throws Exception {
        assertFalse("Calling isValidLogFilename() with an invalid filename should have returned false.",
                logFilenameValidator.isValidLogFilename("log.txt"));
    }
}
