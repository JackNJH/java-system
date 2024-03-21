package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TechnicianComboBox {
    public static ArrayList<String> readTechnicianFile(String filename) {
        ArrayList<String> technicianInfoList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length >= 4 && parts[3].equals("AVAILABLE")) { // Check availability status
                    String technicianName = parts[1];
                    String technicianSpecialty = parts[2];
                    String technicianInfo = technicianName + " - " + technicianSpecialty;
                    technicianInfoList.add(technicianInfo);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return technicianInfoList;
    }
}
