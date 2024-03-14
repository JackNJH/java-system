package ui.Manager;

import java.io.*;
import java.util.Arrays;
import ui.Login;
import utils.CSVParser;


public class ManagerHomePage extends javax.swing.JFrame {
    
    private static String loggedInManager;
    
    public ManagerHomePage(String loggedInManager) {
        displayAppointments();
        displayUserData();
        displayLoginData();
        initComponents();
        this.loggedInManager = loggedInManager;
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(appointmentsLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(viewAppointmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookAppointmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginrecordsLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(systemusersLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(84, 84, 84)))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homepageLabel)
                .addGap(159, 159, 159)
                .addComponent(logoutBtn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoutBtn)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(homepageLabel)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginrecordsLabel)
                    .addComponent(appointmentsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(systemusersLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookAppointmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewAppointmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookAppointmentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAppointmentsBtnActionPerformed
        ManagerBookAppointment bookAppointmentFrame = new ManagerBookAppointment(loggedInManager); // Create an instance of the ManagerBookAppointment class
        bookAppointmentFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bookAppointmentsBtnActionPerformed

    private void viewAppointmentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAppointmentsBtnActionPerformed
        ManagerViewAppointment viewAppointmentFrame = new ManagerViewAppointment(); // Create an instance of the ManagerViewAppointment class
        viewAppointmentFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewAppointmentsBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        try {
            loggedInManager = null;
            Login loginFrame = new Login(); // Create an instance of the Login class
            loginFrame.setVisible(true);
            this.dispose();
        } catch (IOException e) {
            System.err.println("Error opening Login page: " + e.getMessage());
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private String[][] appointmentData;
    private String[][] userData;
    private String[][] loginrecordData;
 
    private void displayAppointments() {
        String filePath = "data/appointment.txt";
        try {
            String[][] allData = CSVParser.parseCSV(filePath);

            appointmentData = new String[allData.length][3];
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
    private javax.swing.JLabel homepageLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel loginrecordsLabel;
    private javax.swing.JTable loginrecordsTable;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel systemusersLabel;
    private javax.swing.JTable systemusersTable;
    private javax.swing.JButton viewAppointmentsBtn;
    // End of variables declaration//GEN-END:variables
}
