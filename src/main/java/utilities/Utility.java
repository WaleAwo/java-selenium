package utilities;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class Utility {

    public static WebDriver driver;

    public static void setUtilityDriver() {
        driver = BasePage.driver;
    }

    // Generate a random number with a specified number of digits
    public static int generateRandomNumber(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be a positive integer.");
        }

        Random random = new Random();
        // Calculate the minimum and maximum bounds based on the length
        int min = (int) Math.pow(10, length - 1);
        int max = (int) Math.pow(10, length) - 1;

        return random.nextInt((max - min) + 1) + min;
    }

    // Return strings to uppercase
    public static String toUpperCase(String input) {
        if (input == null) {
            return null; // Handle null input
        }
        return input.toUpperCase();
    }

    // Return strings to lowercase
    public static String toLowerCase(String input) {
        if (input == null) {
            return null; // Handle null input
        }
        return input.toLowerCase();
    }

    // Generate a random alphanumeric string a specified number of characters
    public static String generateRandomName(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be a positive integer.");
        }

        String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphanumeric.length());
            result.append(alphanumeric.charAt(index));
        }

        return result.toString();
    }

    public static String generateRandomName(int length, String prefix) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be a positive integer.");
        }

        if (prefix == null) {
            throw new IllegalArgumentException("Prefix cannot be null.");
        }

        String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder(prefix);  // Start with the prefix
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphanumeric.length());
            result.append(alphanumeric.charAt(index));
        }

        return result.toString();
    }

    // Clean up the input by trimming and removing extra spaces
    public static String cleanInput(String input) {
        if (input == null) {
            return null;
        }
        return input.trim().replaceAll("\\s+", " ");
    }
}
