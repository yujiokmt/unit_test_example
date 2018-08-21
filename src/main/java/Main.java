package main.java;

import main.java.util.FileExtensionsManager;
import main.java.util.FileExtensionsManagerImpl;
import main.java.util.LogFilenameValidator;

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
