package Array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arrA = {2, 8, 9, 5, 5, 5, 7};
        Arrays.sort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println("index of 5 = " + Arrays.binarySearch(arrA, 5)); // tra ve index
        System.out.println("index of 4 = " + Arrays.binarySearch(arrA, 4)); // tra ve index

        String[] listContact = {"Vinh", "John", "Nathan"};
        findContact(listContact, "Vinh");

        // so sanh 2 mang
        int[] arrB = {1,2,3,4};
        int[] arrC = {4,3,2,1};
        System.out.println(Arrays.equals(arrB, arrC));
        Arrays.sort(arrC);
        System.out.println(Arrays.equals(arrB, arrC));
    }

    private static void findContact(String[] contact ,String name) {
        Arrays.sort(contact);
        if (Arrays.binarySearch(contact, name) >= 0) {
            System.out.printf("Found %s in the list.%n", name);
        } else {
            System.out.println("Not founded!");
        }
    }
}
