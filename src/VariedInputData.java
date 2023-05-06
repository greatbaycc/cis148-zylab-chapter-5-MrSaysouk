import java.util.Scanner;

public class VariedInputData {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int count = 0;
        int max = 0;
        int total = 0;
        int avg;

        int num = scnr.nextInt();
        while (num >= 0) {
            max = Math.max(max, num);
            total = total + num;
            ++count;
            num = scnr.nextInt();
        }

        avg = count == 0 ? 0 : (total/count);
        System.out.println(avg + " " + max);
    }
}
