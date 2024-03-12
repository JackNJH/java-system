package javasystem;

import java.io.IOException;
import ui.Login;

public class JavaSystem {
    public static void main(String[] args) throws IOException {
        // Initialize and display the Login GUI
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
    }
}

