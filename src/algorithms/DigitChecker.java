package algorithms;

public class DigitChecker {
    public boolean isDigit(String str){

        if (str.isEmpty()) return true;

        char ch = str.charAt(0);

        if (ch < '0' || ch > '9') return false;

        return isDigit(str.substring(1));

    }
}
