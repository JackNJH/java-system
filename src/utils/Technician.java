/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Preston
 */
public class Technician extends User {
    
    private String technicianID;
    
    private String technicianSkills;
    
    private boolean technicianAvailability;
    
    public Technician(String username, String password) {
        super(username, password);
        setRole("Technician");
    }
    
    public void assignedTask() {
        this.technicianAvailability = false;
        // To-Do: Update Technicians.txt data.
    }
    
    public void completedTask() {
        this.technicianAvailability = true;
        // To-Do: Update Technicians.txt data.
    }
    
    // To-Do: Implement a technician's availability list to sort through. The issue is knowing where to place the list. Maybe in the Users,java class?
    
}
