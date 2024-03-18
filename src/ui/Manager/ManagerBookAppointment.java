package ui.Manager;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.JOptionPane;
import utils.InputValidator;
import utils.TechnicianComboBox;

public class ManagerBookAppointment extends javax.swing.JFrame {
    
    // BufferedReader and BufferedWriter not defined as class-level variables
    // Try-with-resources blocks is used instead for bw and br in each method
    
    private static String loggedInManager;
    
    public ManagerBookAppointment(String loggedInManager) {
        initComponents();
        this.loggedInManager = loggedInManager;
        insertTechnicianComboBox(); // Call method to populate technician combo box
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookAppointmentLabel = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        customerNameField = new javax.swing.JTextField();
        customerRoomLabel = new javax.swing.JLabel();
        customerRoomField = new javax.swing.JTextField();
        requestLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestField = new javax.swing.JTextArea();
        addCommentsLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        addCommentsField = new javax.swing.JTextArea();
        goBackBtn = new javax.swing.JButton();
        confirmBtn = new javax.swing.JButton();
        customerRoomLabel1 = new javax.swing.JLabel();
        technicianSelect = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bookAppointmentLabel.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        bookAppointmentLabel.setText("Book Appointment");

        customerNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        customerNameLabel.setText("Customer Name:");

        customerNameField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        customerNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameFieldActionPerformed(evt);
            }
        });

        customerRoomLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        customerRoomLabel.setText("Customer Room:");

        customerRoomField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        customerRoomField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerRoomFieldActionPerformed(evt);
            }
        });

        requestLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        requestLabel.setText("Request:");

        requestField.setColumns(20);
        requestField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        requestField.setLineWrap(true);
        requestField.setRows(3);
        jScrollPane1.setViewportView(requestField);

        addCommentsLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        addCommentsLabel.setText("Add. Comments:");

        addCommentsField.setColumns(20);
        addCommentsField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addCommentsField.setLineWrap(true);
        addCommentsField.setRows(5);
        jScrollPane2.setViewportView(addCommentsField);

        goBackBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        goBackBtn.setText("Go Back");
        goBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtnActionPerformed(evt);
            }
        });

        confirmBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        customerRoomLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        customerRoomLabel1.setText("Assign to:");

        technicianSelect.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        technicianSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "On hold" }));
        technicianSelect.setToolTipText("");
        technicianSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                technicianSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(bookAppointmentLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(requestLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(goBackBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(confirmBtn))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(customerNameLabel)
                                        .addComponent(customerRoomLabel))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(customerRoomField)
                                        .addComponent(customerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(addCommentsLabel)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(customerRoomLabel1)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                                        .addComponent(technicianSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(bookAppointmentLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameLabel)
                    .addComponent(customerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerRoomLabel)
                    .addComponent(customerRoomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(requestLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addCommentsLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerRoomLabel1)
                    .addComponent(technicianSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameFieldActionPerformed

    }//GEN-LAST:event_customerNameFieldActionPerformed

    private void customerRoomFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerRoomFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerRoomFieldActionPerformed

    private void goBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtnActionPerformed
        ManagerHomePage homepageframe = new ManagerHomePage(loggedInManager); // Create an instance of the ManagerHomePage class
        homepageframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goBackBtnActionPerformed

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        String appointmentInfo;
        
        // Get next ID for .txt files using methods created
        String appointmentID = "AP"+getNextAppointmentID();
        String managerID = getManagerID(loggedInManager);
        String receiptID = "R"+getNextReceiptID();
        
        
        // Extract customer details from user inputs
        String customerName = customerNameField.getText().trim();
        String customerRoom = customerRoomField.getText().trim();
        String customerID = getCustomerID(customerName, customerRoom);
        
        // Extract technician details from selected combo box
        String technicianName = technicianSelect.getSelectedItem().toString();
        String technicianID = null; // Default to null for "On hold" option
        if (!technicianName.equals("On hold")) {
            technicianID = getTechnicianID(technicianName); // Method to get technician's ID based on name after reformatting
        }
        
        // Request and additional comments field
        String request = requestField.getText().trim();
        String addComments = addCommentsField.getText().trim();
        
        // Validation
        if (customerName.isEmpty() || customerRoom.isEmpty() || request.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Missing Information", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        if (!InputValidator.isValidUsername(customerName) || !InputValidator.isValidUsername(customerRoom)){
            JOptionPane.showMessageDialog(this, "Invalid fields. Special characters deteced or it exceeds 20 characters.", "Invalid Format", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        // If "On hold" option selected, set status as pending assignment
        String appointmentStatus = (technicianID != null) ? "ASSIGNED" : "PENDING ASSIGNMENT";
        
        if (addComments.isEmpty()) {
            addComments = null;
        }        
        
        // If no matching customer name + room is found in customer.txt, create new row for new customer
        if (customerID == null) {
            // Create a new customer ID
            int nextCustomerID = getNextCustomerID();
            customerID = "C" + nextCustomerID;
            addCustomerToFile(customerID, customerName, customerRoom);
        }
        
        // If no additional comments, save addComments data without quotations (addComments = null)
        // For consistent formatting's sake (?)
        if (addComments == null) {
            appointmentInfo = String.format("%s, %s, %s, %s, \"%s\", %s, %s, NULL, %s",
                appointmentID, managerID, customerID, technicianID, request, getCurrentDate(), appointmentStatus, addComments);
        } else {
            appointmentInfo = String.format("%s, %s, %s, %s, \"%s\", %s, %s, NULL, \"%s\"",
                appointmentID, managerID, customerID, technicianID, request, getCurrentDate(), appointmentStatus, addComments);
        }
        
        // Initialize a receipt array, mostly accessible / editable from technician's side
        String receiptInfo = String.format("%s, %s, NULL, NOT COMPLETE, NULL, NULL, NULL",
        receiptID, appointmentID);
        
        // Write into .txt file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("data/appointment.txt", true))) {
            bw.write(appointmentInfo);
            bw.newLine();
            JOptionPane.showMessageDialog(this, "Appointment made successfully", "Booking Success", JOptionPane.INFORMATION_MESSAGE);
            customerNameField.setText("");
            customerRoomField.setText("");
            requestField.setText("");
            addCommentsField.setText("");
            technicianSelect.setSelectedItem("On hold");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        
        try (BufferedWriter bwReceipt = new BufferedWriter(new FileWriter("data/receipt.txt", true))) {
            bwReceipt.write(receiptInfo);
            bwReceipt.newLine(); 
        } catch (IOException e) {
            System.err.println("Error writing receipt info to file: " + e.getMessage());
        }
        
    }//GEN-LAST:event_confirmBtnActionPerformed

    private int getNextIDFromFile(String filename, String idPrefix) {
        int maxID = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length > 0) {
                    String id = parts[0].trim();
                    if (id.startsWith(idPrefix)) {
                        
                        // Convert the string into int after removing the prefix by using substring
                        int idNumber = Integer.parseInt(id.substring(idPrefix.length()));
                        if (idNumber > maxID) {
                            maxID = idNumber;
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return maxID + 1; // Prepare the next ID for selected file
    }

    private int getNextReceiptID() {
        return getNextIDFromFile("data/receipt.txt", "R");
    }

    private int getNextCustomerID() {
        return getNextIDFromFile("data/customer.txt", "C");
    }
    
    private int getNextAppointmentID() {
        return getNextIDFromFile("data/appointment.txt", "AP");
    }

    private static String getManagerID(String loggedInManager) {
        String managerID = null;

        try (BufferedReader br = new BufferedReader(new FileReader("data/manager.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length > 1) {
                    String managerUsername = parts[1].trim(); 
                    if (managerUsername.equalsIgnoreCase(loggedInManager)) {
                        managerID = parts[0].trim();
                        break; 
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return managerID;
    }
    
    private String getCustomerID(String customerName, String customerRoom) {
        try (BufferedReader br = new BufferedReader(new FileReader("data/customer.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length > 2) {
                    String name = parts[1].trim();
                    String room = parts[2].trim();
                    if (name.equalsIgnoreCase(customerName) && room.equalsIgnoreCase(customerRoom)) {
                        return parts[0].trim(); // Return customer ID if customer with entered details
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return null; 
    }
    
    private String getTechnicianID(String selectedTechnician) {
        String[] parts = selectedTechnician.split(" - ");
        String technicianName = parts[0].trim();
        String technicianSpecialty = parts[1].trim();

        try (BufferedReader br = new BufferedReader(new FileReader("data/technician.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineParts = line.split(", ");
                if (lineParts.length >= 2) {
                    String techID = lineParts[0].trim();
                    String techName = lineParts[1].trim();
                    String techSpecialty = lineParts[2].trim();
                    if (techName.equalsIgnoreCase(technicianName) && techSpecialty.equalsIgnoreCase(technicianSpecialty)) {
                        return techID;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return null; // Technician not found
    }
    
    private void addCustomerToFile(String customerID, String customerName, String customerRoom) {
        String customerInfo = String.format("%s, %s, %s", customerID, customerName, customerRoom);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("data/customer.txt", true))) {
            bw.write(customerInfo);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
    
    private static String getCurrentDate() {
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM uuuu");
        String formattedDate = currentDate.format(formatter);

        return formattedDate;
    }
    

    private void technicianSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_technicianSelectActionPerformed

    }//GEN-LAST:event_technicianSelectActionPerformed

    private void insertTechnicianComboBox() {
        
        // Extract formatted arrays of technicians info into variable
        ArrayList<String> technicianInfoList = TechnicianComboBox.readTechnicianFile("data/technician.txt");
        if (technicianInfoList != null) {
            for (String info : technicianInfoList) {
                technicianSelect.addItem(info);
            }
        }
    }

    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (loggedInManager != null && !loggedInManager.isEmpty()) {
                    new ManagerBookAppointment(loggedInManager).setVisible(true);
                } else {
                    System.out.println("No manager logged in.");
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addCommentsField;
    private javax.swing.JLabel addCommentsLabel;
    private javax.swing.JLabel bookAppointmentLabel;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JTextField customerNameField;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JTextField customerRoomField;
    private javax.swing.JLabel customerRoomLabel;
    private javax.swing.JLabel customerRoomLabel1;
    private javax.swing.JButton goBackBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea requestField;
    private javax.swing.JLabel requestLabel;
    private javax.swing.JComboBox<String> technicianSelect;
    // End of variables declaration//GEN-END:variables
}
