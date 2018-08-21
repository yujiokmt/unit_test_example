package main.java.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileExtensionsManagerImpl implements FileExtensionsManager {

    public boolean isValid(String extension) {
        List<String> valid_extensions_list = new ArrayList<String>();
        try {
            File file = new File("config.txt");
            BufferedReader in = new BufferedReader(new FileReader(file));
            String str;
            while ((str = in.readLine()) != null) {
                valid_extensions_list.add(str);
            }
            in.close();
        } catch (IOException e) {
            // handle the exception
        }

        return valid_extensions_list.contains(extension);
    }
}
