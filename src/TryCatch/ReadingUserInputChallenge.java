package TryCatch;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 1;
        do {
            System.out.print("Enter number " + count + ": ");
            try {
                String input  = sc.nextLine();
                sum += Integer.parseInt(input);
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Try Again.");
            }
        } while (count < 6);
        System.out.println(sum);
    }


}
