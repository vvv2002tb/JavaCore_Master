package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = sc.nextInt();
        int a = findMin(len);
        System.out.println("Min in array is: " + a);
    }

    private static int findMin(int len) {
        Scanner sc = new Scanner(System.in);
        int[] intArr = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Enter your number of index " + i + ": ");
            intArr[i] = sc.nextInt();
        }
        Arrays.sort(intArr);

        return intArr[0];
    }



}
