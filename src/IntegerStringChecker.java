import java.util.Scanner;

public class IntegerStringChecker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userString;
        boolean allDigits;
        int i = 0;

        allDigits = true;
        userString = scnr.next();

        while (i < userString.length() && allDigits) {
            allDigits = Character.isDigit(userString.charAt(i));
            ++i;
        }

        if (allDigits) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
