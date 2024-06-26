package utils;

import java.io.*;
import java.util.*;

public class CSVParser {
    public static String[][] parseCSV(String filePath) throws IOException {
        List<String[]> dataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1); //ignore commas in quotes (for exp, comments + requests)
                for (int i = 0; i < parts.length; i++) { 
                    parts[i] = parts[i].trim(); // Remove leading and trailing spaces
                    
                    // Remove surrounding quotes if present
                    if (parts[i].startsWith("\"") && parts[i].endsWith("\"")) {
                        parts[i] = parts[i].substring(1, parts[i].length() - 1);
                    }
                }
                dataList.add(parts); 
            }
        }

        return dataList.toArray(new String[0][]); //Convert ArrayList to 2D Array
    }
}