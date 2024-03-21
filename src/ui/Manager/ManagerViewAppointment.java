package ui.Manager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import utils.CSVParser;


public class ManagerViewAppointment extends javax.swing.JFrame {

    private static String loggedInManager; 
    private String[][] appointmentData;

    public ManagerViewAppointment(String loggedInManager) {
        displayAppointments(); //Get appointmentData
        initComponents(); 
        this.loggedInManager = loggedInManager; //Set loggedInManager variable for this class through the loggedInManager passed to the constructor
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewDetailsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewDetailsTable = new javax.swing.JTable();
        goBackBtn = new javax.swing.JButton();
        tipsLabel = new javax.swing.JLabel();
        filterField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();

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
                int columnClicked = viewDetailsTable.columnAtPoint(evt.getPoint());
                if (columnClicked == 0) {
                    int selectedRow = viewDetailsTable.getSelectedRow();
                    if (selectedRow != -1) { // Ensure a row is selected
                        String appointmentID = appointmentData[selectedRow][0];
                        String customerName = appointmentData[selectedRow][1];
                        String selectedTechnician = appointmentData[selectedRow][3];

                        // Create an instance of ManagerAdditionalDetails and pass the appointmentID and customerName
                        ManagerAdditionalDetails additionalDetailsFrame = new ManagerAdditionalDetails(appointmentID, customerName, loggedInManager, selectedTechnician);
                        additionalDetailsFrame.setVisible(true);
                        ManagerViewAppointment.this.dispose();
                    }
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

        tipsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tipsLabel.setText("(Click on appointment ID column to view/edit additional details)");

        filterField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        filterField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Filter:");

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteBtn.setText("Delete Appointment");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewDetailsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filterField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(goBackBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteBtn)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDetailsLabel)
                    .addComponent(tipsLabel)
                    .addComponent(filterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtnActionPerformed
        ManagerHomePage homepageframe = new ManagerHomePage(loggedInManager); // Create an instance of the ManagerHomePage class
        homepageframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goBackBtnActionPerformed

    private void filterFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterFieldActionPerformed
        String text = filterField.getText().trim();
        
        // Get the table model using 'DefaultTableModel' from viewDetailsTable
        DefaultTableModel model = (DefaultTableModel) viewDetailsTable.getModel();
        
        // Make a sorter instance and set on table using 'setRowSorter'
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        viewDetailsTable.setRowSorter(sorter);

        // Null setRowFilter will display all rows
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            try {
                
                // Regex-based row filter based on the text in filterField
                RowFilter<DefaultTableModel, Object> rf = RowFilter.regexFilter("(?i)" + text);
                sorter.setRowFilter(rf);
            } catch (java.util.regex.PatternSyntaxException e) {
                System.err.println("Invalid regex pattern: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_filterFieldActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRow = viewDetailsTable.getSelectedRow(); // This gets the row number of the selected row from the table starting from 0
        
        // -1 means no row selected since indices start from 0
        if (selectedRow == -1) { 
            JOptionPane.showMessageDialog(this, "Please select an appointment to delete.", "Delete Appointment", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String appointmentID = viewDetailsTable.getValueAt(selectedRow, 0).toString(); // Get value of first column 
        
        int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete "+appointmentID+"?", "Confirm Clear", JOptionPane.YES_NO_OPTION);
        
        if (confirmation == JOptionPane.YES_OPTION){
            // Input file paths
            String appointmentFilePath = "data/appointment.txt";
            String receiptFilePath = "data/receipt.txt";
            // Delete user from user.txt and update role files
            deleteAppt(appointmentID, appointmentFilePath, receiptFilePath);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void deleteAppt(String appointmentID, String appointmentFilePath, String receiptFilePath){
        
        try {
            String[][] appointmentDataArray = CSVParser.parseCSV(appointmentFilePath);
            String[][] receiptDataArray = CSVParser.parseCSV(receiptFilePath);
            
            // Remove appointment and receipt entries with the specified ID
            appointmentDataArray = removeEntry(appointmentID, appointmentDataArray, 0); // Index 0 for appointment ID
            receiptDataArray = removeEntry(appointmentID, receiptDataArray, 1);
            
            writeCSV(appointmentDataArray, appointmentFilePath);
            writeCSV(receiptDataArray, receiptFilePath);
            
            JOptionPane.showMessageDialog(this, "Appointment deleted successfully", "Delete Appointment", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (IOException e) {
            System.err.println("Error deleting user: " + e.getMessage());
        }
    }
    
    private String[][] removeEntry(String entryID, String[][] dataArray, int idIndex) {
       List<String[]> updatedList = new ArrayList<>();
       for (String[] entry : dataArray) {
           if (!entry[idIndex].equals(entryID)) { // Keep rows whose ID doesn't match
               updatedList.add(entry);
           }
       }
       return updatedList.toArray(new String[0][]);
   }
    
    
    private void writeCSV(String[][] data, String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String[] row : data) {
                writer.write(String.join(", ", row));
                writer.newLine();
            }
        }
    }
    
    
    private void displayAppointments(){
        
        String appointmentFilePath = "data/appointment.txt";
        String customerFilePath = "data/customer.txt";
        String technicianFilePath = "data/technician.txt";
        String managerFilePath = "data/manager.txt";
        
        try {
            
            //Parsing the arrays using CSVParser to return raw data with consideration to quotations 
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
                    
                    // Match manager ID for manager name
                    String managerId = appointmentRow[1];
                    boolean managerMatched = false;
                    for (String[] managerRow : managerDataRaw) {
                        if (managerRow.length >= 2 && managerId.equals(managerRow[0])) {
                            appointmentData[i][4] = managerRow[1]; // managerName
                            managerMatched = true;
                            break; 
                        }
                    }
                    if (!managerMatched) {
                        appointmentData[i][4] = "DELETED";
                    }
                    
                    // Match technician ID for technician name
                    String technicianId = appointmentRow[3];
                    boolean technicianMatched = false;
                    for (String[] technicianRow : technicianDataRaw) {
                        if (technicianRow.length >= 2 && technicianId.equals(technicianRow[0])) {
                            appointmentData[i][3] = technicianRow[1]; // technicianName
                            technicianMatched = true;
                            break; 
                        }
                    }
                    if (!technicianMatched) {
                        appointmentData[i][3] = "NULL";
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
                    new ManagerViewAppointment(loggedInManager).setVisible(true);
                } else {
                    System.out.println("No manager logged in.");
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField filterField;
    private javax.swing.JButton goBackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tipsLabel;
    private javax.swing.JLabel viewDetailsLabel;
    private javax.swing.JTable viewDetailsTable;
    // End of variables declaration//GEN-END:variables
}
