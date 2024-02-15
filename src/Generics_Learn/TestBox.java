package Generics_Learn;

public class TestBox {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>("Smartphone");
        System.out.println(box1.getValue());

        Box<Integer> box2 = new Box<>(0);

        System.out.println(box2.getValue());
    }
}
