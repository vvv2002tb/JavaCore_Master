package List_ArrayList_LinkedList.ArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList_Learn {
    public static void main(String[] args) {
        LinkedList<String> city = new LinkedList<>(List.of("Ha noi", "New york", "Manchester", "Paris", "Madrid"));
        printItinerary3(city);
    }

    private static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip start at " + list.getFirst());
        ListIterator<String> iterator = list.listIterator();
        System.out.println(iterator);
        System.out.println("Trip end at " + list.getLast());
    }
}
