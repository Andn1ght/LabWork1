package algorithms;

public class DigitChecker {

    /**
     * Checks if the given string contains only digits.
     *
     * @param str the string to check for digits
     * @return true if the string contains only digits, false otherwise
     */
    public boolean isDigit(String str){

        // Base case: if the string is empty, it contains only digits
        if (str.isEmpty()) {
            return true;
        }

        // Check if the first character in the string is a digit
        char ch = str.charAt(0);
        if (ch < '0' || ch > '9') {
            return false;
        }

        // Recursive case: check the rest of the string for digits
        return isDigit(str.substring(1));
    }
}
