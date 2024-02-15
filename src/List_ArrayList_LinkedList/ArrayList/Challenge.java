package List_ArrayList_LinkedList.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listItems = new ArrayList<>();
        int choose = 0;
        do {

            System.out.println("Available Action");
            System.out.println("0 - to shutdown");
            System.out.println("1 - to add item(s) to do list (comma delimited list)");
            System.out.println("2 - to remove item(s) from list (comma delimited list)");
            try {
                System.out.print("Enter a number for which action you want to do: ");
                choose = sc.nextInt();
                switch (choose) {
                    case 1 -> addItems(listItems);
                    case 2 -> removeItems(listItems);
                    default -> {
                        System.out.println("Please choose exactly!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Fail!");
            }

        } while (choose != 0);
    }

    private static ArrayList<String> addItems(ArrayList<String> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a item: ");
        String items = sc.nextLine();
        String[] splits = items.split(",");
        for (int i = 0; i < splits.length; i++) {
            list.add(i, splits[i].trim());
        }

        System.out.println(list);
        return list;
    }

    private static ArrayList<String> removeItems(ArrayList<String> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a item need remove: ");
        String items = sc.nextLine();
        String[] splits = items.split(",");

        if (list.size() < 1) {
            System.out.println("Don't have element, can't run process.");
        } else {
            for (int i = 0; i < splits.length; i++) {
                list.remove(splits[i].trim());
            }
            System.out.println(list);
        }

        return list;
    }


}
