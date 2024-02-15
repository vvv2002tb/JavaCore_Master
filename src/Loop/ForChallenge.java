package Loop;

public class ForChallenge {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " is " + (isPrime(i) ? "" : "Not ") + "a prime number.");
            if (isPrime(i)) {
                count++;
                if (count >= 3) {
                    System.out.println("Found 3 - Exiting for loop");
                    break;
                }
            }
        }
        // hoac
//        for (int i = 0; count < 3 && i <= 10; i++) {
//            if (isPrime(i)) {
//                System.out.println(i + " is " + (isPrime(i) ? "" : "Not ") + "a prime number.");
//                count++;
//            }
//        }

        System.out.println(count);

    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int i = 2; i <= wholeNumber / 2; i++) {
            if (wholeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
