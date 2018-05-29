package com.example.junit;

import com.example.jnit.FileExtensionsManager;

public class StubFileExtensionsManagerImpl implements FileExtensionsManager {
    @Override
    public boolean isValid(String extension) {
        return true;
    }
}
