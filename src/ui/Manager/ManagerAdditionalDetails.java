/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Manager;

/**
 *
 * @author User
 */
public class ManagerAdditionalDetails extends javax.swing.JFrame {


    public ManagerAdditionalDetails() {
        initComponents();
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
        jScrollPane2.setViewportView(tFeedbackValue);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tFeedbackLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cFeedbackLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 76, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(additionalDetailsLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(completionDateLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(completionDateValue, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(54, 54, 54)
                                            .addComponent(customerNameLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(customerNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(appointmentIDLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(appointmentIDValue, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(paymentStatusLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(paymentStatusValue, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(paymentAmountLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(paymentAmountValue, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(goBackBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveChangesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(additionalDetailsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appointmentIDValue)
                    .addComponent(appointmentIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameLabel)
                    .addComponent(customerNameValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(completionDateLabel)
                    .addComponent(completionDateValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentStatusLabel)
                    .addComponent(paymentStatusValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentAmountLabel)
                    .addComponent(paymentAmountValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cFeedbackLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tFeedbackLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goBackBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveChangesBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtnActionPerformed
        ManagerViewAppointment viewAppointmentFrame = new ManagerViewAppointment(); // Create an instance of the ManagerHomePage class
        viewAppointmentFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goBackBtnActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerAdditionalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerAdditionalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerAdditionalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerAdditionalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerAdditionalDetails().setVisible(true);
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
    // End of variables declaration//GEN-END:variables
}
