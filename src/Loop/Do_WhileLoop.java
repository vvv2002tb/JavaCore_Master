package Loop;

public class Do_WhileLoop {
    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }

        int j = 1;
        while (true) { // or (j > 5)
            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
        }

        System.out.println();

        boolean isReady = false;
        do {
            System.out.println("Do something");
        } while (isReady);

        //continue
        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) { // bỏ qua tất cả số chia hết cho 25
                continue; // sau khi if = true thì nó sẽ không chạy xuống dòng dưới mà nó sẽ lặp vòng mới và i -> 30
            }
            System.out.print(number+ "_");
        }

        System.out.println();

        int k = 0;
        while (k < 10) {
            k++;
            if (k % 2 !=0) {
                continue;
            }
            System.out.println("Số chẵn là : " + k);
        }
    }
}
