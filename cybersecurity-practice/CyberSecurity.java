import javax.swing.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

public class CyberSecurity {

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Check Password Strength", "Generate Hash", "Exit"};
            int choice = JOptionPane.showOptionDialog(
                    null,
                    "Cybersecurity Practice Tool",
                    "Cybersecurity Practice",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            if (choice == -1 || choice == 2) break;

            switch (choice) {
                case 0 -> checkPassword();
                case 1 -> generateHash();
            }
        }
    }

    private static void checkPassword() {
        String password = JOptionPane.showInputDialog("Enter password to check strength:");
        if (password == null) return;

        StringBuilder result = new StringBuilder();
        int score = 0;

        if (password.length() >= 8) score++;
        if (Pattern.compile("[A-Z]").matcher(password).find()) score++;
        if (Pattern.compile("[a-z]").matcher(password).find()) score++;
        if (Pattern.compile("[0-9]").matcher(password).find()) score++;
        if (Pattern.compile("[^A-Za-z0-9]").matcher(password).find()) score++;

        result.append("Password Strength: ");
        switch (score) {
            case 5 -> result.append("Very Strong 💪");
            case 4 -> result.append("Strong ✅");
            case 3 -> result.append("Medium ⚠️");
            case 2 -> result.append("Weak ❌");
            default -> result.append("Very Weak ❌❌");
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }

    private static void generateHash() {
        String input = JOptionPane.showInputDialog("Enter text to hash (SHA-256):");
        if (input == null) return;

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            JOptionPane.showMessageDialog(null, "SHA-256 Hash:\n" + hexString);
        } catch (NoSuchAlgorithmException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
