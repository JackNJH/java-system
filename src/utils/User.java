/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Preston
 */
public class User {
    private String username;
    private String password;
    private String role;
    
    
    
    // Constructor
    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public User() {
    
    }
    
    public String returnUsername() {
        return username;
    }
    
    public String returnPassword() {
        return this.password;
    }
    
    public String returnRole() {
        return this.role;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    
    public static void main(String[] args) {
        User currentUser = new User("Presto", "abc123");
    }
}
