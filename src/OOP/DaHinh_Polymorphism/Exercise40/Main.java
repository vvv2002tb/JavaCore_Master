package OOP.DaHinh_Polymorphism.Exercise40;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Mitsubishi(6, "Xpander");
        System.out.println(myCar);
        myCar.startEngine();
    }
}
