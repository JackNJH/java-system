package ui.Manager;
import java.io.*;
import javax.swing.JOptionPane;
import utils.InputValidator;


public class ManagerRegister extends javax.swing.JFrame {
    
    private static String loggedInManager;
    
    private BufferedReader br;
    private BufferedWriter bw;
    
    // Initialize variables for getLastIDs
    private int lastUserID; 
    private int lastManagerID;
    private int lastTechnicianID;
    
    
    public ManagerRegister(String loggedInManager) throws IOException {
        initComponents();
        getLastIDs(); // Get largest ID from user, manager, technician
        this.loggedInManager = loggedInManager;
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
        userroleField = new javax.swing.JComboBox<>();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginTitle.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        loginTitle.setText("REGISTRATION UI");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        passwordLabel.setText("Password:");

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        usernameLabel.setText("Username:");

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        cpasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cpasswordLabel.setText("Confirm Password:");

        cpasswordField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cpasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpasswordFieldActionPerformed(evt);
            }
        });

        userroleLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        userroleLabel.setText("User Role:");

        registerBtn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        userroleField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        userroleField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Technician" }));
        userroleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userroleFieldActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(loginTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(passwordLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(usernameLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cpasswordLabel)
                                        .addComponent(userroleLabel))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cpasswordField)
                                        .addComponent(userroleField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
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
                .addGap(18, 18, 18)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(16, 16, 16))
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
           
        // Reads input for following fields and ensures data consistency with trim
        String username = usernameField.getText().trim(); 
        String password = passwordField.getText().trim();
        String cpassword = cpasswordField.getText().trim();
        String userRole = userroleField.getSelectedItem().toString();

        // Check if any of the fields are empty
        if (username.isEmpty() || password.isEmpty() || cpassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields", "Registration Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit method
        }
        
        // Check password and confirmed password
        if (!password.equals(cpassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match", "Registration Error", JOptionPane.ERROR_MESSAGE);
            return; //Exit method
        }
        
        // Check whether username has special characters / exceed word liimt
        if (!InputValidator.isValidUsername(username)) {
            JOptionPane.showMessageDialog(this, "Invalid username. Special characters deteced or it exceeds 20 characters.", "Registration Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit method
        }

        // Check whether password has contains commas
        if (!InputValidator.isValidPassword(password)) {
            JOptionPane.showMessageDialog(this, "Invalid password. Password cannot contain commas.", "Registration Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit method
        }
        
        // Check if username already exists
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

            // Insert into user.txt
            bw = new BufferedWriter(new FileWriter("data/user.txt", true));
            bw.write("U"+lastUserID+", "+username+", "+password+", "+userRole);
            bw.newLine();
            bw.close();
            
            // Add user into technician or manager data file as well
            if (userRole.equalsIgnoreCase("Manager")) {
                bw = new BufferedWriter(new FileWriter("data/manager.txt", true));
                bw.write("M" + lastManagerID + ", " + username);
                bw.newLine();
            } else if (userRole.equalsIgnoreCase("Technician")) {
                bw = new BufferedWriter(new FileWriter("data/technician.txt", true));
                bw.write("T" + lastTechnicianID + ", " + username + ", " + "General");
                bw.newLine();
            }
            
            JOptionPane.showMessageDialog(this, "User registered successfully", "Registration Success", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            ManagerHomePage managerHomePage = new ManagerHomePage(loggedInManager);
            managerHomePage.setVisible(true);
            
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

    private void getLastIDs() throws IOException {
        
        //Last user ID
        br = new BufferedReader(new FileReader("data/user.txt"));
        String line;
        while ((line = br.readLine()) != null) { // Reads all line till null
            String[] parts = line.split(", ");
            if (parts.length > 0) {
                String userIdStr = parts[0].substring(1); // Gets user ID from first index and removes the prefix with "U" substring 1
                int userId = Integer.parseInt(userIdStr); // Converts string to integer for comparing values
                if (userId > lastUserID) { // Gets biggest user ID value
                    lastUserID = userId; 
                }
            }
        }
        br.close();
        lastUserID++; // Prepare for the next user registration
        
        //Last manager ID
        br = new BufferedReader(new FileReader("data/manager.txt"));
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(", "); 
            if (parts.length > 0) {
                String managerIdStr = parts[0].substring(1);
                int managerId = Integer.parseInt(managerIdStr);
                if (managerId > lastManagerID) {
                    lastManagerID = managerId;
                }
            }
        }
        br.close();
        lastManagerID++;
        
        //Last technician ID
        br = new BufferedReader(new FileReader("data/technician.txt"));
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(", ");
            if (parts.length > 0) {
                String technicianIdStr = parts[0].substring(1);
                int technicianId = Integer.parseInt(technicianIdStr);
                if (technicianId > lastTechnicianID) {
                    lastTechnicianID = technicianId;
                }
            }
        }
        br.close();
        lastTechnicianID++;
        
    }
    
    private void userroleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userroleFieldActionPerformed
        
    }//GEN-LAST:event_userroleFieldActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        ManagerHomePage managerHP = new ManagerHomePage(loggedInManager);
        managerHP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    if (loggedInManager != null && !loggedInManager.isEmpty()) {
                        new ManagerRegister(loggedInManager).setVisible(true);
                    } else {
                        System.out.println("No manager logged in.");
                    }
                } catch (IOException e) {
                    System.err.println("Error initializing ManagerRegister: " + e.getMessage());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cpasswordField;
    private javax.swing.JLabel cpasswordLabel;
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
