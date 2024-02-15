package TryCatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(getInputFromScanner(2024));
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = sc.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        int age = 0;
        boolean validDOB = false;
        do {
            System.out.print("What year were you born? ");
            try {
                age = checkData(2024, sc.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException e) {
                System.out.println("Characters not allowed!! Try again.");
            }
        } while (!validDOB);


        return "So you are " + age + " years old.";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear  = currentYear - 125; // nam hien tai - ng song lau nhat 125 nam

        if (dob < minimumYear || dob > currentYear) {
            return -1;
        }
        return currentYear - dob;
    }
}
