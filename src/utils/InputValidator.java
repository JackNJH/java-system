package utils;

import java.util.regex.Pattern;

public class InputValidator {
    
    private static final Pattern SPECIAL_CHAR_PATTERN = Pattern.compile("[^a-zA-Z0-9 ]"); 
    
    private InputValidator() {
        
    }

    public static boolean isValidUsername(String username) {
        return !SPECIAL_CHAR_PATTERN.matcher(username).find() && username.length() <= 20;
    }
    
    public static boolean isValidPassword(String password) {
        return !password.contains(",");
    }
}
