package List_ArrayList_LinkedList.ArrayList;

import java.util.*;

public class MoreList {
    public static void main(String[] args) {
        String[] items = {"apple", "milk", "bananas", "eggs"};

        List<String> list = List.of(items);
//        list.add("water"); can't
        System.out.println(list);
        System.out.println(list.getClass().getName());

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("water");
        System.out.println(groceries);

        System.out.println();
        ArrayList<String> nextList = new ArrayList<>(List.of("Mouse", "Dog", "Cat"));
        System.out.println(nextList);

        ArrayList<String> nextList2 = new ArrayList<>(List.of("Elephant", "Snake", "Cow"));
        nextList2.addAll(nextList);
        System.out.println(nextList2);
        System.out.println("------------");

        // get phan tu
//        System.out.println(nextList2[0]); can't
        System.out.println("The first animal in arrayList: " + nextList2.get(0));
        System.out.println("------------");

        // kiem tra co chua phan tu hay khong tra ve boolean
        System.out.println("Is has Cow? Answers: " + nextList2.contains("Cow"));
        System.out.println("------------");

        // tra ve kich thuoc
        System.out.println("Length of arrList: " + nextList2.size());
        System.out.println("------------");


        // kiem tra fisrt, last cua 1 phan tu
        nextList2.add("Dog");
        System.out.println(nextList2);
        System.out.println("First Dog is index: " + nextList2.indexOf("Dog"));
        System.out.println("First Dog is index: " + nextList2.lastIndexOf("Dog"));

        System.out.println("------------");
        // xoa phan tu
//        nextList2.remove(1); xoa bang index
        nextList2.remove("Snake"); // xoa bang object
        System.out.println(nextList2);
        if (!nextList2.contains("Snake")) {
            System.out.println("Phần tử Snake đã được xóa!");
        }

        System.out.println("----Xóa các phần tử Dog and Mouse----");
        nextList2.removeAll(List.of("Dog", "Mouse"));
        System.out.println(nextList2);
        System.out.println("----giữ các phần tử Cow and Cat----");
        nextList2.retainAll(List.of("Cow", "Cat"));
        System.out.println(nextList2);

        //xoa sach
        System.out.println("----Clean----");
        nextList2.clear();
        System.out.println(nextList2);
        System.out.println("isEmpty = " + nextList2.isEmpty());
        System.out.println("-------------");


        // add all
        nextList2.addAll(List.of("Elephant", "Snake", "Cow", "Mouse", "Dog", "Cat"));
        nextList2.addAll(Arrays.asList("Dragon", "Fish"));
        System.out.println(nextList2);

        // sap xep
        System.out.println("---Sort---");
        nextList2.sort(Comparator.naturalOrder());
        //        Collections.sort(nextList2);
        System.out.println(nextList2);


        //reverse
        System.out.println("----reverse----");
        nextList2.sort(Comparator.reverseOrder());
        System.out.println(nextList2);

        //Test
        String[] strings = {"Anh", "Nam", "Bo"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));


        //
        ArrayList<Integer> integerArrayList = new ArrayList<>(List.of(3, 1, 4, 9, 5));
        System.out.println(integerArrayList);
        integerArrayList.sort(Comparator.naturalOrder());
        System.out.println(integerArrayList);

    }
}
