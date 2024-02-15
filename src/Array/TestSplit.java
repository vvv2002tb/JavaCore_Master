package Array;

import java.util.Arrays;

public class TestSplit {
    public static void main(String[] args) {
        String input = "12, 1, 0, 4, 99, 192";
        String[] splits = input.split(",");
        System.out.println(Arrays.toString(splits));

        int[] intArr = new int[splits.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(splits[i].trim());
        }
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        System.out.println("Max is " + intArr[intArr.length - 1]);




    }
}
