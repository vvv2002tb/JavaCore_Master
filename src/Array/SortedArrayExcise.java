package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArrayExcise {
    public static void main(String[] args) {
        int[] arr = getIntegers(4);
        System.out.println(Arrays.toString(arr));
        printArray(sortIntegers(arr));

    }

    private static int[] getIntegers(int len) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Enter a number for index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static int[] sortIntegers(int[] arr) {
        int temp = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                if (arr[j] < arr[k]) {
                    temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return Arrays.copyOf(arr, arr.length);

    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }
}
