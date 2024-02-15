package Loop;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigit(131));


    }

    public static int sumDigit(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        } else if (number < 10) {

            return number;
        }
        while (number >= 10)
        {
            sum += (number % 10);
            number = number / 10;
        }
        sum += number;
        return sum;
    }
}
