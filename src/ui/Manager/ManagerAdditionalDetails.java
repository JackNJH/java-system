package ui.Manager;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import utils.CSVParser;
import utils.TechnicianComboBox;


public class ManagerAdditionalDetails extends javax.swing.JFrame {

    private String[][] receiptData;
    private String[][] appointmentData;
    private static String loggedInManager;
    
    public ManagerAdditionalDetails(String appointmentID, String customerName, String loggedInManager, String selectedTechnician) {
        initComponents();
        
        appointmentIDValue.setText(appointmentID);
        customerNameValue.setText(customerName);
        
        loadReceiptData(); // Initialize class-level variable receiptData
        displayDetails(appointmentID);
        
        this.loggedInManager = loggedInManager;
        insertTechnicianComboBox(selectedTechnician); // Get technician details from parameters passed
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        saveChangesBtn = new javax.swing.JButton();
        goBackBtn = new javax.swing.JButton();
        additionalDetailsLabel = new javax.swing.JLabel();
        appointmentIDValue = new javax.swing.JLabel();
        appointmentIDLabel = new javax.swing.JLabel();
        customerNameValue = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        completionDateValue = new javax.swing.JLabel();
        completionDateLabel = new javax.swing.JLabel();
        paymentStatusValue = new javax.swing.JLabel();
        paymentStatusLabel = new javax.swing.JLabel();
        paymentAmountValue = new javax.swing.JLabel();
        paymentAmountLabel = new javax.swing.JLabel();
        cFeedbackLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cFeedbackValue = new javax.swing.JTextArea();
        tFeedbackLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tFeedbackValue = new javax.swing.JTextArea();
        technicianNameLabel = new javax.swing.JLabel();
        technicianNameValue = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        saveChangesBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        saveChangesBtn.setText("Save Changes");
        saveChangesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesBtnActionPerformed(evt);
            }
        });

        goBackBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        goBackBtn.setText("Go Back");
        goBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtnActionPerformed(evt);
            }
        });

        additionalDetailsLabel.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        additionalDetailsLabel.setText("Additional Details");

        appointmentIDValue.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        appointmentIDValue.setText("ID");

        appointmentIDLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        appointmentIDLabel.setText("Appointment ID:");

        customerNameValue.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        customerNameValue.setText("Name");

        customerNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        customerNameLabel.setText("Customer:");

        completionDateValue.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        completionDateValue.setText("Date");

        completionDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        completionDateLabel.setText("Completion Date:");

        paymentStatusValue.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        paymentStatusValue.setText("Status");

        paymentStatusLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        paymentStatusLabel.setText("Payment Status:");

        paymentAmountValue.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        paymentAmountValue.setText("Amount");

        paymentAmountLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        paymentAmountLabel.setText("Payment Amount:");

        cFeedbackLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cFeedbackLabel.setText("Customer Feedback:");

        cFeedbackValue.setColumns(20);
        cFeedbackValue.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cFeedbackValue.setRows(4);
        jScrollPane1.setViewportView(cFeedbackValue);

        tFeedbackLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tFeedbackLabel.setText("Technician Feedback:");

        tFeedbackValue.setColumns(20);
        tFeedbackValue.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tFeedbackValue.setRows(4);
        tFeedbackValue.setEditable(false);
        jScrollPane2.setViewportView(tFeedbackValue);

        technicianNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        technicianNameLabel.setText("Technician:");

        technicianNameValue.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        technicianNameValue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "On hold" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(appointmentIDLabel)
                    .addComponent(customerNameLabel)
                    .addComponent(technicianNameLabel)
                    .addComponent(completionDateLabel)
                    .addComponent(paymentStatusLabel)
                    .addComponent(paymentAmountLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(customerNameValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(appointmentIDValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(technicianNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(completionDateValue, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentStatusValue, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentAmountValue, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cFeedbackLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(goBackBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(saveChangesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(tFeedbackLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(additionalDetailsLabel)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(additionalDetailsLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appointmentIDValue)
                    .addComponent(appointmentIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameLabel)
                    .addComponent(customerNameValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(technicianNameLabel)
                    .addComponent(technicianNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(completionDateLabel)
                    .addComponent(completionDateValue))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentStatusLabel)
                    .addComponent(paymentStatusValue))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymentAmountLabel)
                    .addComponent(paymentAmountValue))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cFeedbackLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tFeedbackLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveChangesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtnActionPerformed
        ManagerViewAppointment viewAppointmentFrame = new ManagerViewAppointment(loggedInManager); // Create an instance of the ManagerHomePage class
        viewAppointmentFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goBackBtnActionPerformed

    private void saveChangesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesBtnActionPerformed

        String updatedCFeedback = cFeedbackValue.getText();

        if (receiptData != null) {
            for (String[] receipt : receiptData) {
                if (receipt[1].equals(appointmentIDValue.getText())) {
                    String originalCFeedback = receipt[2]; // Store the original cFeedback value
                    if (!updatedCFeedback.equals(originalCFeedback)) {
                        if (updatedCFeedback.isEmpty()) {
                            receipt[2] = "NULL"; 
                        } else {
                            receipt[2] = "\"" + updatedCFeedback + "\""; // Update the cFeedback value with quotes
                        }
                    }
                    break; 
                }
            }
        }
        
        saveDataToFile();
        updateAppointmentFile();
        
        JOptionPane.showMessageDialog(this, "Changes saved successfully!", "Saved", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_saveChangesBtnActionPerformed

    private void saveDataToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("data/receipt.txt"))) {
            for (String[] receipt : receiptData) {
                
                // Add quotes for technician's + customer's feedback field (index 6 + 2) since CSVParser removed quotations. 
                for (int i = 0; i < receipt.length; i++) {
                    if ((i == 2 || i == 6) && !receipt[i].equals("NULL")) {
                        bw.write("\"" + receipt[i] + "\"");
                    } else {
                        bw.write(receipt[i]); // Normal operation if not index 6 / 2
                    }
                    if (i < receipt.length - 1) {
                        bw.write(", ");
                    }
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void updateAppointmentFile() {

        List<String> updatedLines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("data/appointment.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                String appointmentID = parts[0];

                if (appointmentID.equals(appointmentIDValue.getText())) {
                    String technicianName = technicianNameValue.getSelectedItem().toString().split(" - ")[0];
                    String technicianID = getTechnicianIDFromName(technicianName);
                    parts[3] = technicianID ;

                    if (technicianNameValue.getSelectedItem().equals("On hold")) {
                        parts[6] = "PENDING ASSIGNMENT"; // status
                        parts[3] = "NULL"; // technicianID
                    } else {
                        parts[6] = "ASSIGNED";
                    }

                    // Reconstruct the line with updated values
                    line = String.join(", ", parts);
                }

                updatedLines.add(line); // New array
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write updated line to appointment.txt
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("data/appointment.txt"))) {
            for (String updatedLine : updatedLines) {
                bw.write(updatedLine);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getTechnicianIDFromName(String technicianName) {
        String technicianID = "NULL"; 
        try {
            String[][] technicianData = CSVParser.parseCSV("data/technician.txt");
            for (String[] technician : technicianData) {
                if (technician.length >= 2 && technician[1].equalsIgnoreCase(technicianName)) {
                    technicianID = technician[0]; 
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return technicianID;
    }
    
    private void loadReceiptData() {
        try {
            receiptData = CSVParser.parseCSV("data/receipt.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    private void displayDetails(String appointmentID) {
        if (receiptData != null) {
            for (String[] receipt : receiptData) {
                if (receipt[1].equals(appointmentID)) {
                    completionDateValue.setText(receipt[4]); // Display completion date
                    paymentStatusValue.setText(receipt[3]); // Display payment status
                    paymentAmountValue.setText(receipt[5]); // Display payment amount

                    
                    // Dont let managers change assignment of technician if the appointment is already completed
                    if (receipt[3].equals("COMPLETED")) {
                        technicianNameValue.setEnabled(false);
                    } else {
                        technicianNameValue.setEnabled(true);
                    }
                    
                    if (receipt[2].equals("NULL")) {
                        cFeedbackValue.setText(""); // Set text to empty if customer feedback is NULL
                    } else {
                        cFeedbackValue.setText(receipt[2]);
                    }

                    if (receipt[6].equals("NULL")) {
                        tFeedbackValue.setText(""); // Set text to empty if technician feedback is NULL
                    } else {
                        tFeedbackValue.setText(receipt[6]);
                    }
                    break;
                }
            }
        }
    }
    
    private void insertTechnicianComboBox(String selectedTechnician) {
        // Extract formatted arrays of technicians info into variable
        ArrayList<String> technicianInfoList = TechnicianComboBox.readTechnicianFile("data/technician.txt");
        if (technicianInfoList != null) {
            for (String info : technicianInfoList) {
                String technicianName = info.split(" - ")[0];
                technicianNameValue.addItem(info); 
                if (technicianName.equals(selectedTechnician)) { 
                    technicianNameValue.setSelectedItem(info); // Set the label based on the parameter passed
                }
            }
        }
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String appointmentID = "ID";
                String customerName = "Customer";
                String selectedTechnician = "Technician";
                
                if (loggedInManager != null && !loggedInManager.isEmpty()) {
                    new ManagerAdditionalDetails(appointmentID, customerName, loggedInManager, selectedTechnician).setVisible(true);
                } else {
                    System.out.println("No manager logged in.");
                }
                
                
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel additionalDetailsLabel;
    private javax.swing.JLabel appointmentIDLabel;
    private javax.swing.JLabel appointmentIDValue;
    private javax.swing.JLabel cFeedbackLabel;
    private javax.swing.JTextArea cFeedbackValue;
    private javax.swing.JLabel completionDateLabel;
    private javax.swing.JLabel completionDateValue;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JLabel customerNameValue;
    private javax.swing.JButton goBackBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel paymentAmountLabel;
    private javax.swing.JLabel paymentAmountValue;
    private javax.swing.JLabel paymentStatusLabel;
    private javax.swing.JLabel paymentStatusValue;
    private javax.swing.JButton saveChangesBtn;
    private javax.swing.JLabel tFeedbackLabel;
    private javax.swing.JTextArea tFeedbackValue;
    private javax.swing.JLabel technicianNameLabel;
    private javax.swing.JComboBox<String> technicianNameValue;
    // End of variables declaration//GEN-END:variables
}
