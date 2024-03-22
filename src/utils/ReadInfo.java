/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.IOException;

/**
 *
 * @author Shade
 */
public class ReadInfo {
    public static String[][] getData(int counter, String selector, String filePath) {
        
        String[][] resultData = null;
    
        try {
            String[][] allData = CSVParser.parseCSV(filePath);

            resultData = new String[allData.length][counter];
            for (int i = 0; i < allData.length; i++) {
                String[] row = allData[i];
                if (row.length >= 1) {
                    
                    // Converts String apptRows to array values.
                    String[] apptRowsArray = selector.split(",");
                    
                    for (int j = 0; j < counter; j++) {
                        resultData[i][j] = row[Integer.parseInt(apptRowsArray[j])]; // Converts array values to integer and displays data.
                    }
                    
                } else {
                    //Error handling
                    System.err.println("Invalid row format at index " + i);
                }
            }
            
            return resultData;
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return resultData;
        
    }

}
