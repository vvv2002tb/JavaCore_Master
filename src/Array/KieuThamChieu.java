package Array;

public class KieuThamChieu {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        myIntArray[0] = 1;

        System.out.println(myIntArray);
        System.out.println(anotherArray);
        System.out.println(anotherArray[0]);
    }

    
}
