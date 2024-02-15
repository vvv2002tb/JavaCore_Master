package TryCatch;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        int countNumber = 0;
        long AVG = 0;
        while (true) {
            System.out.println("Enter a number, character to quit: ");
            String input = sc.nextLine();
            try {
                int number = Integer.parseInt(input);
                sum += number;
                countNumber++;
            } catch (NumberFormatException e) {
                break;
            }
        }
        AVG = sum / countNumber;
        System.out.println("Sum = " + sum + " AVG = " + AVG);
    }
}
