import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        int i;
        boolean stop = false;

        while (!stop) {
            userInput = scnr.nextLine();
            if (userInput.contains("Quit") || userInput.contains("quit") || userInput.contains("q")) {
                userInput = userInput.substring(0, userInput.toLowerCase().indexOf("q"));
                stop = true;
                break;
            }
            for (i = 0; i < userInput.length(); ++i) {
                System.out.print(userInput.charAt(userInput.length() - i - 1));
            }
            System.out.println();
        }
    }
}
