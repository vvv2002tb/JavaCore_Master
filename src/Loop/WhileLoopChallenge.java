package Loop;

public class WhileLoopChallenge {
    public static void main(String[] args) {

        int start = 4;
        int end = 20;
        int sum = 0;
        int count = 0;
        while (start <= end) {
            if (count == 5) {
                System.out.println("Đã tìm thấy 5 số chẵn!");
                break;
            }
            if (isEvenNumber(start)) {
                System.out.println("Số chẵn là: " + start);
                sum += start;
                count++;
            }

            start++;
        }
        System.out.println("sum is " + sum);


    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
