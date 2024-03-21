package ui.Manager;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import ui.Login;
import utils.CSVParser;


public class ManagerHomePage extends javax.swing.JFrame {
    
    private static String loggedInManager;
    
    // Arrays to store table data
    private String[][] appointmentData;
    private String[][] userData;
    private String[][] loginrecordData;
    
    public ManagerHomePage(String loggedInManager) {
        displayAppointments(); //Get appointmentData
        displayUserData(); //Get userData
        displayLoginData(); //Get loginRecordData
        initComponents();
        this.loggedInManager = loggedInManager; //Set loggedInManager variable for this class through the loggedInManager passed to the constructor
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemusersLabel = new javax.swing.JLabel();
        homepageLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        systemusersTable = new javax.swing.JTable();
        bookAppointmentsBtn = new javax.swing.JButton();
        loginrecordsLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        loginrecordsTable = new javax.swing.JTable();
        viewAppointmentsBtn = new javax.swing.JButton();
        appointmentsLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        appointmentsTable = new javax.swing.JTable();
        logoutBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        deleteUserBtn = new javax.swing.JButton();
        clearRecordsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        systemusersLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        systemusersLabel.setText("System Users");

        homepageLabel.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        homepageLabel.setText("Manager Home Page");

        systemusersTable.setModel(new javax.swing.table.DefaultTableModel(
            userData,
            new String [] {
                "Username", "Role"
            }
        ));
        jScrollPane1.setViewportView(systemusersTable);

        bookAppointmentsBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookAppointmentsBtn.setText("Book Appointment");
        bookAppointmentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAppointmentsBtnActionPerformed(evt);
            }
        });

        loginrecordsLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginrecordsLabel.setText("Login Records");

        loginrecordsTable.setModel(new javax.swing.table.DefaultTableModel(
            loginrecordData,
            new String [] {
                "Username", "Role", "Login Time"
            }
        ));
        loginrecordsTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        loginrecordsTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        loginrecordsTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        jScrollPane2.setViewportView(loginrecordsTable);

        viewAppointmentsBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewAppointmentsBtn.setText("View Appointments");
        viewAppointmentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAppointmentsBtnActionPerformed(evt);
            }
        });

        appointmentsLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        appointmentsLabel.setText("Appointments Status");

        appointmentsTable.setModel(new javax.swing.table.DefaultTableModel(
            appointmentData,
            new String [] {
                "ID", "Appointed Date", "Status"
            }
        ));
        appointmentsTable.getColumnModel().getColumn(0).setPreferredWidth(30);
        appointmentsTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        appointmentsTable.getColumnModel().getColumn(2).setPreferredWidth(150);
        jScrollPane3.setViewportView(appointmentsTable);

        logoutBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        registerBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerBtn.setText("Register New User");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        deleteUserBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteUserBtn.setText("Delete User");
        deleteUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserBtnActionPerformed(evt);
            }
        });

        clearRecordsBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearRecordsBtn.setText("Clear Records");
        clearRecordsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearRecordsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(appointmentsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginrecordsLabel)
                .addGap(137, 137, 137))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homepageLabel)
                .addGap(7, 7, 7)
                .addComponent(registerBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutBtn)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookAppointmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewAppointmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(systemusersLabel)
                                    .addComponent(clearRecordsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(deleteUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logoutBtn)
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(homepageLabel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginrecordsLabel)
                    .addComponent(appointmentsLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookAppointmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewAppointmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearRecordsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(systemusersLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookAppointmentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAppointmentsBtnActionPerformed
        ManagerBookAppointment bookAppointmentFrame = new ManagerBookAppointment(loggedInManager);
        bookAppointmentFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bookAppointmentsBtnActionPerformed

    private void viewAppointmentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAppointmentsBtnActionPerformed
        ManagerViewAppointment viewAppointmentFrame = new ManagerViewAppointment(loggedInManager);
        viewAppointmentFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewAppointmentsBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        try {
            loggedInManager = null;
            Login loginFrame = new Login(); 
            loginFrame.setVisible(true);
            this.dispose();
        } catch (IOException e) {
            System.err.println("Error opening Login page: " + e.getMessage());
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        try {
            ManagerRegister registerFrame = new ManagerRegister(loggedInManager); 
            registerFrame.setVisible(true);
            this.dispose();
        } catch (IOException e) {
            System.err.println("Error opening Registration page: " + e.getMessage());
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void deleteUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserBtnActionPerformed
        
        int selectedRow = systemusersTable.getSelectedRow(); // This gets the row number of the selected row from the table starting from 0
        
        // -1 means no row selected since indices start from 0
        if (selectedRow == -1) { 
            JOptionPane.showMessageDialog(this, "Please select a user to delete.", "Delete User", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String usernameToDelete = systemusersTable.getValueAt(selectedRow, 0).toString(); // Get value of first column 
        
        if (usernameToDelete.equals(loggedInManager)){
            JOptionPane.showMessageDialog(this, "You can't ban yourself.", "Delete User", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove "+usernameToDelete+"?", "Confirm Clear", JOptionPane.YES_NO_OPTION);
        
        if (confirmation == JOptionPane.YES_OPTION){
            try {
                // Input file paths
                String userFilePath = "data/user.txt";
                String managerFilePath = "data/manager.txt";
                String technicianFilePath = "data/technician.txt";
                String appointmentFilePath = "data/appointment.txt";

                // Delete user from user.txt and update role files
                deleteUser(usernameToDelete, userFilePath, managerFilePath, technicianFilePath, appointmentFilePath);


            } catch (IOException e) {
                System.err.println("Error deleting user: " + e.getMessage());
                JOptionPane.showMessageDialog(this, "Error deleting user", "Delete User", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_deleteUserBtnActionPerformed

    private void deleteUser(String usernameToDelete, String userFilePath, String managerFilePath, String technicianFilePath, String appointmentFilePath) throws IOException {
        try {
            
            // Read string content into 2D array
            String[][] userDataArray = CSVParser.parseCSV(userFilePath);
            String[][] managerDataArray = CSVParser.parseCSV(managerFilePath);
            String[][] technicianDataArray = CSVParser.parseCSV(technicianFilePath);
            String[][] appointmentDataArray = CSVParser.parseCSV(appointmentFilePath);
            
            // Delete user from user.txt
            userDataArray = removeUser(userDataArray, usernameToDelete, 1);

            // Remove user from their role .txt
            managerDataArray = removeUser(managerDataArray, usernameToDelete, 1);
            technicianDataArray = removeUser(technicianDataArray, usernameToDelete, 1);
            
            // Change appointment status of appointments under technician to "PENDING ASSIGNMENT"
            appointmentDataArray = updateAppointments(appointmentDataArray, technicianDataArray);
        
            // Write updated data back to files
            writeCSV(userDataArray, userFilePath);
            writeCSV(managerDataArray, managerFilePath);
            writeCSV(technicianDataArray, technicianFilePath);
            writeCSV(appointmentDataArray, appointmentFilePath);
            
            JOptionPane.showMessageDialog(this, "User deleted successfully", "Delete User", JOptionPane.INFORMATION_MESSAGE);
        
        } catch (IOException e) {
            System.err.println("Error deleting user: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error deleting user", "Delete User", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void writeCSV(String[][] data, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String[] row : data) {
                writer.write(String.join(", ", row));
                writer.newLine();
            }
        }
    }
    
    // Basically rewrites the role .txt file excluding the row with the deleted user
    private String[][] removeUser(String[][] data, String usernameToDelete, int columnIndex) { // (data = 2D array, usernameToDelete = username from column 0 in table, columnIndex = the column of username in .txt file)
        List<String[]> newDataList = new ArrayList<>(); 
        for (String[] row : data) { 
            if (!row[columnIndex].equals(usernameToDelete)) { 
                newDataList.add(row);
            }
        }
        return newDataList.toArray(new String[0][]); // Back to 2D array
    }
    
    private String[][] updateAppointments(String[][] appointmentDataArray, String[][] technicianDataArray) {
        
        // Get all the technician ID first
        for (String[] appointment : appointmentDataArray) {
            String technicianId = appointment[3]; 
            boolean foundTechnician = false;

            // Check if technician ID exists in technicianDataArray
            for (String[] technician : technicianDataArray) {
                if (technicianId != null && technicianId.equals(technician[0])) { // Means if technician still exists
                    foundTechnician = true;
                    break;
                }
            }

            if (!foundTechnician) {
                appointment[6] = "PENDING ASSIGNMENT";
                appointment[3] = "NULL"; 
            }
            
            // Add quotation marks to request and add. comments again
            if (appointment.length > 4 && !appointment[4].startsWith("\"")) {
                appointment[4] = "\"" + appointment[4] + "\"";
            }
            if (appointment.length > 8 && !appointment[8].startsWith("\"")) {
                appointment[8] = "\"" + appointment[8] + "\"";
            }
        }
        return appointmentDataArray;
    }
    
    private void clearRecordsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearRecordsBtnActionPerformed
        // Show a confirmation dialog to the user
        int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to clear login records?", "Confirm Clear", JOptionPane.YES_NO_OPTION);

        if (confirmation == JOptionPane.YES_OPTION) {
            try {
                FileWriter writer = new FileWriter("data/login_records.txt", false); // Overwrites file with ...... nothing (deletes everything)
                writer.close();
                JOptionPane.showMessageDialog(this, "Login records cleared successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                System.err.println("Error clearing login records: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_clearRecordsBtnActionPerformed

    private void displayAppointments() {
        String filePath = "data/appointment.txt";
        try {
            
            // Used CSVParser to read values in quotations
            String[][] allData = CSVParser.parseCSV(filePath);

            appointmentData = new String[allData.length][3]; //Get number of arrays (rows) in appointment.txt and set column to 3
            
            for (int i = 0; i < allData.length; i++) {
                String[] row = allData[i];
                if (row.length >= 7) { 
                    appointmentData[i][0] = row[0]; // appointmentID
                    appointmentData[i][1] = row[5]; // appointedDate
                    appointmentData[i][2] = row[6]; // status
                } else {
                    //Error handling
                    System.err.println("Invalid row format at index " + i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void displayUserData(){
        String filePath = "data/user.txt";
        try {
            
            String[][] allData = CSVParser.parseCSV(filePath);

            userData = new String[allData.length][2];
            for (int i = 0; i < allData.length; i++) {
                String[] row = allData[i];
                if (row.length >= 3) {
                    userData[i][0] = row[1]; // userName
                    userData[i][1] = row[3]; // userRole
                } else {
                    //Error handling
                    System.err.println("Invalid row format at index " + i);
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void displayLoginData() {
        String filePath = "data/login_records.txt";
        try {
            String[][] allData = CSVParser.parseCSV(filePath);

            loginrecordData = new String[allData.length][3];
            for (int i = 0; i < allData.length; i++) {
                String[] row = allData[i];
                if (row.length >= 3) {
                    // Loop through the columns and assign values
                    for (int j = 0; j < 3; j++) {
                        loginrecordData[i][j] = row[j];
                    }
                } else {
                    // Error handling
                    System.err.println("Invalid row format at index " + i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (loggedInManager != null && !loggedInManager.isEmpty()) {
                    new ManagerHomePage(loggedInManager).setVisible(true);
                } else {
                    System.out.println("No manager logged in.");
                }
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appointmentsLabel;
    private javax.swing.JTable appointmentsTable;
    private javax.swing.JButton bookAppointmentsBtn;
    private javax.swing.JButton clearRecordsBtn;
    private javax.swing.JButton deleteUserBtn;
    private javax.swing.JLabel homepageLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel loginrecordsLabel;
    private javax.swing.JTable loginrecordsTable;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel systemusersLabel;
    private javax.swing.JTable systemusersTable;
    private javax.swing.JButton viewAppointmentsBtn;
    // End of variables declaration//GEN-END:variables
}
