package ui;
import java.io.*;
import javax.swing.JOptionPane;


public class Register extends javax.swing.JFrame {
    
    private BufferedReader br;
    private BufferedWriter bw;
    private int lastUserID;
    
    public Register() throws IOException {
        initComponents();
        br = new BufferedReader(new FileReader("data/user.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(", ");
            if (parts.length > 0) {
                String userIdStr = parts[0].substring(1); 
                int userId = Integer.parseInt(userIdStr);
                if (userId > lastUserID) {
                    lastUserID = userId;
                }
            }
        }
        br.close();
        lastUserID++;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginTitle = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        cpasswordLabel = new javax.swing.JLabel();
        cpasswordField = new javax.swing.JTextField();
        userroleLabel = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        loginText = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        userroleField = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        loginTitle.setText("REGISTRATION UI");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        passwordLabel.setText("Password:");

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        usernameLabel.setText("Username:");

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        cpasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cpasswordLabel.setText("Confirm Password:");

        cpasswordField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cpasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpasswordFieldActionPerformed(evt);
            }
        });

        userroleLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        userroleLabel.setText("User Role:");

        registerBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        loginText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginText.setText("Already have an account?");

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        userroleField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        userroleField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Technician" }));
        userroleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userroleFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passwordLabel)
                        .addGap(18, 18, 18)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(186, 186, 186)
                            .addComponent(loginTitle))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(119, 119, 119)
                            .addComponent(usernameLabel)
                            .addGap(18, 18, 18)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginBtn)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cpasswordLabel)
                            .addComponent(userroleLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cpasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(userroleField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userroleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userroleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginText)
                    .addComponent(loginBtn))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void cpasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpasswordFieldActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        String username = usernameField.getText().trim();
        String password = passwordField.getText().trim();
        String cpassword = cpasswordField.getText().trim();
        String userRole = userroleField.getSelectedItem().toString();

        if (!password.equals(cpassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match", "Registration Error", JOptionPane.ERROR_MESSAGE);
            return; //Exit method
        }

        try {
            br = new BufferedReader(new FileReader("data/user.txt"));
            String line;
            boolean usernameExists = false;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length > 1 && parts[1].equalsIgnoreCase(username)) {
                    usernameExists = true;
                    break;
                }
            }
            br.close();

            if (usernameExists) {
                JOptionPane.showMessageDialog(this, "Username already exists", "Registration Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit method
            }

            bw = new BufferedWriter(new FileWriter("data/user.txt", true));
            bw.write("U"+lastUserID+", "+username+", "+password+", "+userRole);
            bw.newLine();
            JOptionPane.showMessageDialog(this, "User registered successfully", "Registration Success", JOptionPane.INFORMATION_MESSAGE);
            openLoginPage(); //Open login page upon successful registration
            
        } catch (IOException e) {
            System.err.println("Error writing to file or reading file: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (IOException e) {
                System.err.println("Error closing streams: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        openLoginPage();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void userroleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userroleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userroleFieldActionPerformed

    private void openLoginPage() {
    try {
        Login loginFrame = new Login(); // Create an instance of the Login class
        loginFrame.setVisible(true);
        this.dispose();
    } catch (IOException e) {
        System.err.println("Error opening Login page: " + e.getMessage());
    }
}


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Register().setVisible(true);
                } catch (IOException e) {
                    System.err.println("Error initializing Register: " + e.getMessage());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpasswordField;
    private javax.swing.JLabel cpasswordLabel;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginText;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JComboBox<String> userroleField;
    private javax.swing.JLabel userroleLabel;
    // End of variables declaration//GEN-END:variables
}
