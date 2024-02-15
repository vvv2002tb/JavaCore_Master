package Array;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[0] = 1;

        System.out.println(intArray[0]);
        System.out.println(intArray[1]);

        double[] myDouble = new double[10];
        myDouble[2] = 3.4;
        System.out.println(myDouble[2]);

        String[] stringArr = new String[10];
        stringArr[0] = "hello";
        System.out.println(stringArr[0]);
        System.out.println(stringArr[1]);

//        String[] name = {"A", "B", "C"};
        int[] firstFivePositives = {1, 2, 3, 4, 5};
        System.out.println(firstFivePositives[0]);
        System.out.println(firstFivePositives.length);
        System.out.println("Last = " + firstFivePositives[firstFivePositives.length - 1]);

        for (int element : firstFivePositives) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println("-----------");

        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2.length - i;
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(arr2));
        int[] randomArray = getRandomArray(10);
        System.out.println(Arrays.toString(randomArray));
        Arrays.sort(randomArray);
        System.out.println("After sort:");
        System.out.println(Arrays.toString(randomArray));
        Arrays.fill(randomArray, 2);
        System.out.println("After fill:");
        System.out.println(Arrays.toString(randomArray));

        // copy array
        System.out.println("This is copy array:");
        int[] copyArray = Arrays.copyOf(randomArray, 10);
        System.out.println(Arrays.toString(copyArray));

        // small coppy
        System.out.println("This is small copy array:");
        int[] copyArraySmall = Arrays.copyOf(randomArray, 5);
        System.out.println(Arrays.toString(copyArraySmall));




    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }
}
