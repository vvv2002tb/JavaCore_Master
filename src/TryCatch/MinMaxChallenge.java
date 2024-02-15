package TryCatch;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double min = 0;
        double max = 0;
        int loopCount = 0;

        while (true)
        {
            System.out.print("Enter a number, or any character to exit: ");
            String nextEntry =  sc.nextLine();
            try {
                double validNum = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNum < min) {
                    min = validNum;
                }
                if (loopCount == 0 || validNum > max) {
                    max = validNum;
                }
                loopCount++;
            } catch (NumberFormatException e) {
                break;
            }


        }
        if (loopCount > 0) {
            System.out.println("min = " + min + ", max = " + max);
        } else  {
            System.out.println("No data");
        }
    }
}
