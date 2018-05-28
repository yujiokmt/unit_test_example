import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileExtensionsManagerImpl implements FileExtensionsManager {
    @Override
    public boolean isValid(String extension) {
        FileReader file_reader = null;
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
            System.out.println(e);
        }

        if (valid_extensions_list.contains(extension)) {
            return true;
        } else {
            return false;
        }
    }
}
