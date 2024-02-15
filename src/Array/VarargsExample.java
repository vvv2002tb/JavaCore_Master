package Array;

public class VarargsExample {
    public static void printNumbers(int... numbers) {
        System.out.println("Number of arguments: " + numbers.length);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Gọi phương thức với số lượng biến đối số không xác định
        printNumbers(1, 2, 3);
        printNumbers(10, 20, 30, 40, 50);
        printNumbers(100, 200);
    }
}
