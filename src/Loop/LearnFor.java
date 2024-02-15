package Loop;

public class LearnFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println(calculateInterest(100_000_001, 0.7) + "$");
        for (double i = 1.0; i < 5.0; i++) {
            System.out.println(calculateInterest(85, i) + "$");
        }

        for (double i = 7.5; i < 10.0; i += 0.25) {

            if (calculateInterest(100, i) == 8.5) {
                break; // out loop
            }
            System.out.println("100$ at " + i + "% interest = " + calculateInterest(100, i) + "$");
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
