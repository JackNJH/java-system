/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Technician;

import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import utils.CSVParser;

/**
 *
 * @author Preston
 */
public class TechnicianHomePage extends javax.swing.JFrame {

    /**
     * Creates new form TechnicianHomePage
     */
    public TechnicianHomePage() {
        initComponents();
//        displayAppointments(4, "0,1,2,3");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel1.setText("Technician Home Page");

        jButton1.setText("Logout");

        appointmentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "AppointmentID", "Created Time", "Problem Context", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(appointmentsTable);
        DefaultTableModel model = (DefaultTableModel) appointmentsTable.getModel();

        String[][] appointmentData = displayAppointments(4, "0,5,4,6");

        model.setRowCount(0);

        for (String[] rowData : appointmentData ) {
            model.addRow(rowData);
        }

        // Function allow for row onclick events to take place

        appointmentsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = appointmentsTable.rowAtPoint(evt.getPoint());
                int col = appointmentsTable.columnAtPoint(evt.getPoint());
                if (row >= 0 && col >= 0) {
                    // Load new page for the specific appointment

                    System.out.println("The row selected is: " + row + " and the column selected is: " + col);

                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(174, 174, 174)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton1)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TechnicianHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TechnicianHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TechnicianHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TechnicianHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TechnicianHomePage().setVisible(true);
            }
        });
    }
    
    
    
    public String[][] displayAppointments(int counter, String selector) {
        
        String[][] appointmentData = null;
        String filePath = "data/appointment.txt";
    
        try {
            String[][] allData = CSVParser.parseCSV(filePath);

            appointmentData = new String[allData.length][counter];
            for (int i = 0; i < allData.length; i++) {
                String[] row = allData[i];
                if (row.length >= 1) {
                    
                    // Converts String apptRows to array values.
                    String[] apptRowsArray = selector.split(",");
                    
                    for (int j = 0; j < counter; j++) {
                        appointmentData[i][j] = row[Integer.parseInt(apptRowsArray[j])]; // Converts array values to integer and displays data.
                    }
                    
                } else {
                    //Error handling
                    System.err.println("Invalid row format at index " + i);
                }
            }
            
            return appointmentData;
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return appointmentData;
        
    }
    
    // Reminder to show the appointments available according to the technician's skillset.
    
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appointmentsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
