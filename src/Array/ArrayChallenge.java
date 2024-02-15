package Array;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sapXepGiamDan(10)));
    }

    private static int[] sapXepGiamDan(int len) {
        int[] randomArray = new int[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            randomArray[i] = random.nextInt(100);
        }
        Arrays.sort(randomArray);
        int temp = 0;
        for (int j = 0; j < len; j++) {
            for (int k = j + 1; k < len; k++) {
                if (randomArray[j] < randomArray[k]) {
                    temp = randomArray[k];
                    randomArray[k] = randomArray[j];
                    randomArray[j] = temp;
                }
            }
        }
        return randomArray;
        
    }

}
