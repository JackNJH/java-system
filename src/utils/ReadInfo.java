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
                    
                    // Converts String selector to array values.
                    String[] rowsArray = selector.split(",");
                    
                    for (int j = 0; j < counter; j++) {
                        resultData[i][j] = row[Integer.parseInt(rowsArray[j])]; // Converts array values to integer and displays data.
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
    
    public static String getUserByID(String userID, String filePathString) {
        
        String filePathCustomer = "data/customer.txt";
        String filePathManager = "data/manager.txt";
        String filePathTechnician = "data/technician.txt";
        
        String selector = null;
        
        if (filePathString.equals("user")) {
            selector = filePathCustomer;
        } else if (filePathString.equals("manager")) {
            selector = filePathManager;
        } else if (filePathString.equals("technician")) {
            selector = filePathTechnician;
        }
        
        String[][] userInformation = getData(2, "0,1", selector);
        String user = null;
        for (String[] userInfo : userInformation) {
            if (userInfo[0].equals(userID) && !userInfo[0].equals(null)) {
                user = userInfo[1];
            } else {
                user = "Not set";
            }
        }
        
        return user;
        
    }

}
