package com.example.jnit;

public class LogFilenameValidator {

    FileExtensionsManager file_ext_manager;

    public LogFilenameValidator(FileExtensionsManager mgr) {
        file_ext_manager = mgr;
    }

    public boolean isValidLogFilename(String filename) {

        String[] filename_split = filename.split("[.]");
        String name = filename_split[0];
        String extension = filename_split[1];
        boolean isValid = false;

        if (name.length()>5 && file_ext_manager.isValid(extension)) {
            isValid = true;
        }
        return isValid;
    }
}
