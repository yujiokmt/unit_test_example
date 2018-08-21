package test.java.util;

import main.java.util.FileExtensionsManager;

public class StubFileExtensionsManagerImpl implements FileExtensionsManager {

    public boolean isValid(String extension) {
        return true;
    }
}
