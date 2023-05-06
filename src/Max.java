import java.util.Scanner;

public class Max {

    public int findMax() {
        Scanner scnr = new Scanner(System.in);
        int maxVal = 0;
        int currVal;

        do {
            currVal = scnr.nextInt();

            if (currVal > maxVal) {
                maxVal = currVal;
            }
        } while (currVal >= 0);

        return maxVal;
    }

    public static void main(String[] args) {
        Max test = new Max();
        System.out.println(test.findMax());
    }
}
