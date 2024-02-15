package Loop;

public class ForChallenge2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; count < 5 && i < 1000; i++) {
            if (i % 3 ==0 && i % 5 == 0){
                sum += i;
                System.out.println("found a match " + i);
                count++;
            }
        }
        System.out.println("sum = " + sum);
    }
}
