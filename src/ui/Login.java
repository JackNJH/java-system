package ui;
import ui.Manager.ManagerHomePage;
import java.io.*;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import ui.Technician.TechnicianHomePage;
import utils.ReadInfo;
import utils.Technician;

public class Login extends javax.swing.JFrame {
    
    private String loggedInManager;
    private String userRole;
    private BufferedReader br;
    private BufferedWriter bw;
    private Technician tech;

    // Initialize formatter function
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy h:mma");
    
    public Login() throws IOException{
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordLabel = new javax.swing.JLabel();
        loginTitle = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        passwordLabel.setText("Password:");

        loginTitle.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        loginTitle.setText("LOGIN UI");

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        usernameLabel.setText("Username:");

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(loginTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed
    
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String enteredUsername = usernameField.getText().trim();
        String enteredPassword = passwordField.getText().trim();
        boolean loginSuccess = checkLogin(enteredUsername, enteredPassword);

        if (loginSuccess){
            
            storeLoginRecord(enteredUsername, userRole);
            
            if ("Manager".equals(userRole)){
                loggedInManager = enteredUsername; 
                JOptionPane.showMessageDialog(this, "Logged in as Manager", "Login Success", JOptionPane.INFORMATION_MESSAGE);
                ManagerHomePage managerHP = new ManagerHomePage(loggedInManager);
                managerHP.setVisible(true);
            }
            else if ("Technician".equals(userRole)){
                JOptionPane.showMessageDialog(this, "Logged in as Technician", "Login Success", JOptionPane.INFORMATION_MESSAGE);
                
                String[][] resultData = ReadInfo.getData(2, "1,2", "data/technician.txt");
                String technicianSkill = null;
                for (String[] row : resultData) {
                    if (row[0].equals(enteredUsername)) {
                       technicianSkill = row[1]; 
                    }
                }
                // Technician instance:
                Technician tech = new Technician(enteredUsername, enteredPassword, technicianSkill); 
                
                this.tech = tech;
                
                new TechnicianHomePage(tech).setVisible(true);
            }

            try {
                br.close(); //Close after successful login
            } catch (IOException e) {
                System.err.println("Error closing BufferedReader: " + e.getMessage());
            }
            
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Error", JOptionPane.ERROR_MESSAGE);
            usernameField.setText("");
            passwordField.setText("");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    
    private boolean checkLogin(String username, String password) {
        try {
            br = new BufferedReader(new FileReader("data/user.txt")); //Reset the BufferedReader to the file beginning

            String line;
            while ((line = br.readLine()) != null) {
                String[] userData = line.split(", ");
                if (userData.length == 4) {
                    String storedUsername = userData[1];
                    String storedPassword = userData[2];
                    String role = userData[3];
                    if (username.equals(storedUsername) && password.equals(storedPassword)) {
                        userRole = role;
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading user data: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
        return false;
    }

    private void storeLoginRecord(String username, String role) {
        try {
            bw = new BufferedWriter(new FileWriter("data/login_records.txt", true));
            
            LocalDateTime now = LocalDateTime.now();
            String formattedDateTime = formatter.format(now);
            
            bw.write(username+", "+role+", "+formattedDateTime);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error writing login record: " + e.getMessage());
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                System.err.println("Error closing BufferedWriter: " + e.getMessage());
            }
        }
    }

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (IOException e) {
                    System.err.println("Error initializing Login: " + e.getMessage());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
