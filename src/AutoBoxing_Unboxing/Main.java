package AutoBoxing_Unboxing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Integer boxedInt = Integer.valueOf(15);

        Integer boxedInt = 15;
//        int unboxInt = boxedInt.intValue();
        // autoboxing
        int unboxInt = boxedInt;
        System.out.println(boxedInt);
        System.out.println(unboxInt);
        System.out.println(boxedInt.getClass().getName());
//        System.out.println(unboxInt.getClass().getName()); can't run

        Double a = getDoubleObject();
        double b = getDoubleObject();

        System.out.println(a);
        System.out.println(b);

        System.out.println(a.getClass().getName());
//        System.out.println(b.getClass().getName()); can't


        System.out.println("-".repeat(10));

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));
        System.out.println(wrapperArray.getClass().getName());
        System.out.println(wrapperArray[0].getClass().getName());

        System.out.println("-".repeat(10));

        Character[] characters = {'a', 'b', 'c'};
        System.out.println(Arrays.toString(characters));
        System.out.println(characters.getClass().getName());
        System.out.println(characters[0].getClass().getName());



    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.0;
    }
}
