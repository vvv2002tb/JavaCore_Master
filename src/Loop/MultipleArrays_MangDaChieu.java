package Loop;

import java.util.Arrays;

public class MultipleArrays_MangDaChieu {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        
        for (int[] element : arr) {
            System.out.println(Arrays.toString(element));
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (i * 10) + (j + 1);
            }
        }
        System.out.println();

        for (int[] element : arr) {
            System.out.println(Arrays.toString(element));
        }
        System.out.println();

        System.out.println(Arrays.deepToString(arr));

        String[][] stringsArr = new String[4][];
        stringsArr[0] = new String[] {"hello", "world"};
        stringsArr[1] = new String[] {"my", "name", "is", "Vinh"};
        stringsArr[2] = new String[] {"abc", "def", "xyz"};

        System.out.println(Arrays.deepToString(stringsArr));



    }
}
