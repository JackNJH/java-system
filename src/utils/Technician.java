/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import utils.ReadInfo;

/**
 *
 * @author Preston
 */
public class Technician extends User {
    
    private String technicianID;
    
    private String technicianSkill;
    
    private boolean technicianAvailability;
    
    public Technician(String username, String password, String skill) {
        super(username, password);
        technicianSkill = skill;
        setRole("Technician");
        System.out.println("Username before getTechnicianID: " + username);
        this.technicianID = getTechnicianID();
    }
    
    public Technician(String username, String password) {
        super(username, password);
        setRole("Technician");
        System.out.println("Username before getTechnicianID: " + username);
        this.technicianID = getTechnicianID();
    }
    
    public String getTechnicianID() {
        String[][] resultData = ReadInfo.getData(2, "0,1", "data/technician.txt");
        String result = null;
        for (String[] row : resultData ) {
            if (row[1].equals(this.returnUsername())) {
                result = row[0];
                System.out.println("Set result to: " + result);
            }
        }
        return result;
        
        
    }
    
//    public void initializeTechnicianID() {
//        this.technicianID = getTechnicianID();
//    }
    
    public void setSkill(String skill) {
        technicianSkill = skill;
        // To-Do: Update Technicians.txt data Index [2]
        
//        System.out.println("Technician ID: " + technicianID);
//        System.out.println("Skill: " + skill);
        
        String filePath = "data/technician.txt";
        File file = new File(filePath);
        StringBuilder newData = new StringBuilder();

        
        System.out.println("TechnicianID: " + technicianID);
        // Read the file and update technician skillset
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length >= 0 && parts[0].equals(technicianID)) {
                    parts[2] = skill; // Update skillset
                    line = String.join(", ", parts);
                }
                newData.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Write the updated contents back to the file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(newData.toString());
            System.out.println("Technician skillset updated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    
    
    
    
    
    
    
    
    public void setAvailability(boolean availability) {
        this.technicianAvailability = availability;
        
        String filePath = "data/technician.txt";
        File file = new File(filePath);
        StringBuilder newData = new StringBuilder();

        // Read the file and update technician availability
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length >= 0 && parts[0].equals(technicianID)) {
                    parts[3] = availability ? "AVAILABLE" : "UNAVAILABLE"; // Update availability with shorthand if else statement
                    line = String.join(", ", parts);
                }
                newData.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Write the updated contents back to the file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(newData.toString());
            System.out.println("Technician availability updated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public void assignedTask() {
        this.technicianAvailability = false;
        // To-Do: Update Technicians.txt data. Index [3]
    }
    
    public void completedTask() {
        this.technicianAvailability = true;
        // To-Do: Update Technicians.txt data. Index [3]
    }
    
    public static void updateReceipt(String filePath, String receiptID, String appointmentID,
                                     String userFeedback, String paymentStatus, String userPaymentTime,
                                     String userPaymentAmount, String technicianComment) {
        File file = new File(filePath);
        StringBuilder newData = new StringBuilder();

        // Read the file and store its contents
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length > 0 && parts[0].equals(receiptID)) {
                    // Update the row
                    newData.append(receiptID).append(", ").append(appointmentID).append(", ");
                    newData.append(userFeedback != null ? "\"" + userFeedback + "\"" : "NULL").append(", ");
                    newData.append(paymentStatus != null ? paymentStatus : "NULL").append(", ");
                    newData.append(userPaymentTime != null ? userPaymentTime : "NULL").append(", ");
                    newData.append(userPaymentAmount != null ? userPaymentAmount : "NULL").append(", ");
                    newData.append(technicianComment != null ? "\"" + technicianComment + "\"" : "NULL");
                    newData.append(System.lineSeparator());
                } else {
                    newData.append(line).append(System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Write the updated contents back to the file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(newData.toString());
            System.out.println("Receipt updated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
//    public static void updateAppointment(String appointmentID, String newRequestStatus) {
//        String filePath = "data/appointment.txt";
//        File file = new File(filePath);
//        StringBuilder newData = new StringBuilder();
//
//        // Read the file and store its contents
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println("Line read: " + line);
//                String[] parts = line.split(", ");
//                if (parts.length > 0 && parts[0].equals(appointmentID)) {
//                    // Update the row
//                    newData.append(appointmentID).append(", ");
//                    newData.append(parts[1]).append(", "); // managerID
//                    newData.append(parts[2]).append(", "); // customerID
//                    newData.append(parts[3]).append(", "); // technicianID
//                    newData.append(parts[4]).append(", "); // customerRequest
//                    newData.append(parts[5]).append(", "); // requestDate
//                    newData.append(newRequestStatus != null ? newRequestStatus : "NULL").append(", "); // requestStatus
//                    newData.append(parts[7]).append(", "); // requestCompletionDate
//                    newData.append(parts[8] != null ? parts[8] : "NULL"); // customerComment
//                    newData.append(System.lineSeparator());
//                } else {
//                    newData.append(line).append(System.lineSeparator());
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//            return;
//        }
//
//        // Write the updated contents back to the file
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
//            bw.write(newData.toString());
//            System.out.println("Appointment updated successfully.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    
        public static void updateAppointment(String appointmentID, String newRequestStatus, String requestCompletionTime) {
        String filePath = "data/appointment.txt";
        File file = new File(filePath);
        StringBuilder newData = new StringBuilder();

        // Read the file and store its contents
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {;
                String[] parts = line.split(", ");
                if (parts.length > 0 && parts[0].equals(appointmentID)) {
                    // Update the row
                    newData.append(appointmentID).append(", ");
                    newData.append(parts[1]).append(", "); // managerID
                    newData.append(parts[2]).append(", "); // customerID
                    newData.append(parts[3]).append(", "); // technicianID
                    newData.append(parts[4]).append(", "); // customerRequest
                    newData.append(parts[5]).append(", "); // requestDate
                    newData.append(newRequestStatus != null ? newRequestStatus : "NULL").append(", "); // requestStatus
                    newData.append(requestCompletionTime != null ? requestCompletionTime : "NULL").append(", "); // requestCompletionDate
                    newData.append(parts[8] != null ? parts[8] : "NULL"); // customerComment
                    newData.append(System.lineSeparator());
                } else {
                    newData.append(line).append(System.lineSeparator());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Write the updated contents back to the file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(newData.toString());
            System.out.println("Appointment overloading updated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
