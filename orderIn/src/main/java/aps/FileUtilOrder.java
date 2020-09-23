package aps;

import com.sun.xml.internal.ws.api.ResourceLoader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUtilOrder {
//读入csv
    public static List<List<String>> readCsv(String path) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            List<List<String>> res = new ArrayList<List<String>>();
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(",");
                res.add(new ArrayList<String>(Arrays.asList(words)));
            }
            reader.close();
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
