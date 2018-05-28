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

    FileExtensionsManager mgr = new StubFileExtensionsManagerImpl();
    LogFilenameValidator logFilenameValidator;

    @Before
    public void before() throws Exception {
        mgr = new StubFileExtensionsManagerImpl();
        logFilenameValidator = new LogFilenameValidator(mgr);
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: isValidLogFilename(String filename)
     */
    @Test
    public void shouldReturnTrueOnValidFilename() throws Exception {
        assertTrue("should've returned true for a valid filename",
                logFilenameValidator.isValidLogFilename("filename.txt"));
    }

    /**
     * Method: isValidLogFilename(String filename)
     */
    @Test
    public void shouldReturnFalseOnInvalidFilename() throws Exception {
        assertFalse("should've returned false for an invalid filename",
                logFilenameValidator.isValidLogFilename("log.txt"));
    }
}
