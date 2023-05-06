import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char userLet;
        String userWord;
        int charCount = 0;
        int i;

        userLet = scnr.next().charAt(0);
        userWord = scnr.nextLine();

        for (i = 0; i < userWord.length(); ++i) {
            if (userWord.charAt(i) == userLet) {
                ++charCount;
            }
        }
        System.out.println(charCount);
    }
}
