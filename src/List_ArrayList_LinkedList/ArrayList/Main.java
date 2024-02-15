package List_ArrayList_LinkedList.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

record Grocery(String name, String type, int count) {
    Grocery(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);                            
    }
}

public class Main {
    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new Grocery("milk");
        groceryArray[1] = "5 oranges";
        groceryArray[2] = new Grocery("apples", "PRODUCE", 6); 

        System.out.println(Arrays.toString(groceryArray));


        ArrayList<Grocery> groceryArrayList = new ArrayList<>();
//        groceryArrayList.add("1"); can't bởi vì đã chỉ định kiểu dữ liệu cho nó
        groceryArrayList.add(new Grocery("Candy"));
        groceryArrayList.add(new Grocery("Bottle of water","DAIRY", 10));
        groceryArrayList.add(0, new Grocery("Pencil"));
        // chen du lieu
        groceryArrayList.set(0, new Grocery("Hat"));
        // xoa du lieu
        groceryArrayList.remove(1);
        

        System.out.println(groceryArrayList);
    }
}
