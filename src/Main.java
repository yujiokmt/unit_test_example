import com.example.jnit.FileExtensionsManager;
import com.example.jnit.FileExtensionsManagerImpl;
import com.example.jnit.LogFilenameValidator;

public class Main {

    public static void main(String[] args) {

        FileExtensionsManager mgr = new FileExtensionsManagerImpl();
        LogFilenameValidator logFilenameValidator = new LogFilenameValidator(mgr);

        String filename = "logfile.txt";
        if (logFilenameValidator.isValidLogFilename(filename)) {
            System.out.println(filename + " is a valid log file name.");
        } else {
            System.out.println(filename + " is NOT a valid log file name.");
        }
    }
}
