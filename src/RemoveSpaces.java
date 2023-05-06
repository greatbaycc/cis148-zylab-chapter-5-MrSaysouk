import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;

        userInput = scnr.nextLine();

        while (userInput.indexOf(" ") != -1) {
            userInput = userInput.replace(" ","");
        }
        System.out.println(userInput);
    }
}
