package ui.Manager;

import java.io.IOException;
import utils.CSVParser;


public class ManagerViewAppointment extends javax.swing.JFrame {

    private static String loggedInManager;

    public ManagerViewAppointment(String loggedInManager) {
        displayAppointments();
        initComponents();
        this.loggedInManager = loggedInManager;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewDetailsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewDetailsTable = new javax.swing.JTable();
        goBackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewDetailsLabel.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        viewDetailsLabel.setText("View Appointment Details");

        viewDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            appointmentData,
            new String [] {
                "ID", "Customer ", "Room", "Appointed To", "Appointed By", "Appointed Date", "Request", "Add. Comments", "Status"
            }
        ));
        viewDetailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int selectedRow = viewDetailsTable.getSelectedRow();
                if (selectedRow != -1) { // Ensure a row is selected
                    String appointmentID = appointmentData[selectedRow][0]; // Assuming appointment ID is at index 0
                    String customerName = appointmentData[selectedRow][1]; // Assuming customer name is at index 1

                    // Create an instance of ManagerAdditionalDetails and pass the appointmentID and customerName
                    ManagerAdditionalDetails additionalDetailsFrame = new ManagerAdditionalDetails(appointmentID, customerName);
                    additionalDetailsFrame.setVisible(true);
                    ManagerViewAppointment.this.dispose();
                }
            }
        });
        viewDetailsTable.getColumnModel().getColumn(0).setPreferredWidth(1);
        viewDetailsTable.getColumnModel().getColumn(1).setPreferredWidth(30);
        viewDetailsTable.getColumnModel().getColumn(2).setPreferredWidth(30);
        viewDetailsTable.getColumnModel().getColumn(3).setPreferredWidth(30);
        viewDetailsTable.getColumnModel().getColumn(4).setPreferredWidth(30);
        viewDetailsTable.getColumnModel().getColumn(5).setPreferredWidth(100);
        viewDetailsTable.getColumnModel().getColumn(6).setPreferredWidth(150);
        viewDetailsTable.getColumnModel().getColumn(7).setPreferredWidth(150);
        viewDetailsTable.getColumnModel().getColumn(8).setPreferredWidth(100);
        jScrollPane1.setViewportView(viewDetailsTable);

        goBackBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        goBackBtn.setText("Go Back");
        goBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goBackBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(viewDetailsLabel)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(viewDetailsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(goBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtnActionPerformed
        ManagerHomePage homepageframe = new ManagerHomePage(loggedInManager); // Create an instance of the ManagerHomePage class
        homepageframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goBackBtnActionPerformed

    private String[][] appointmentData;
    
    private void displayAppointments(){
        
        String appointmentFilePath = "data/appointment.txt";
        String customerFilePath = "data/customer.txt";
        String technicianFilePath = "data/technician.txt";
        String managerFilePath = "data/manager.txt";
        
        try {
            String[][] appointmentDataRaw = CSVParser.parseCSV(appointmentFilePath);
            String[][] customerDataRaw = CSVParser.parseCSV(customerFilePath);
            String[][] technicianDataRaw = CSVParser.parseCSV(technicianFilePath);
            String[][] managerDataRaw = CSVParser.parseCSV(managerFilePath);
            
            appointmentData = new String[appointmentDataRaw.length][9];

            for (int i = 0; i < appointmentDataRaw.length; i++) {
                String[] appointmentRow = appointmentDataRaw[i];
                if (appointmentRow.length >= 7) {
                    appointmentData[i][0] = appointmentRow[0]; // appointmentID
                    appointmentData[i][5] = appointmentRow[5]; // requestDate
                    appointmentData[i][6] = appointmentRow[4]; // request
                    appointmentData[i][7] = appointmentRow[8]; // addComments
                    appointmentData[i][8] = appointmentRow[6]; // status

                    // Match customer ID to get room information
                    String customerId = appointmentRow[2];
                    for (String[] customerRow : customerDataRaw) {
                        if (customerRow.length >= 3 && customerId.equals(customerRow[0])) {
                            appointmentData[i][1] = customerRow[1]; // customerName
                            appointmentData[i][2] = customerRow[2]; // customerRoom
                            break;
                        }
                    }
                    
                    // Match technician ID for technician name
                    String managerId = appointmentRow[1];
                    for (String[] managerRow : managerDataRaw) {
                        if (managerRow.length >= 2 && managerId.equals(managerRow[0])) {
                            appointmentData[i][4] = managerRow[1]; // managerName
                            break; 
                        }
                    }
                    
                    // Match manager ID for manager name
                    String technicianId = appointmentRow[3];
                    for (String[] technicianRow : technicianDataRaw) {
                        if (technicianRow.length >= 2 && technicianId.equals(technicianRow[0])) {
                            appointmentData[i][3] = technicianRow[1]; // technicianName
                            break; 
                        }
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

    // Other methods and components of your class

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerViewAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                if (loggedInManager != null && !loggedInManager.isEmpty()) {
//                    new ManagerViewAppointment(loggedInManager).setVisible(true);
//                } else {
//                    System.out.println("No manager logged in.");
//                }
            new ManagerViewAppointment(loggedInManager).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goBackBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel viewDetailsLabel;
    private javax.swing.JTable viewDetailsTable;
    // End of variables declaration//GEN-END:variables
}
