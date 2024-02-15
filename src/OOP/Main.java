package OOP;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.setMake("Toyota");
        toyota.setModel("Vios");
        toyota.setColor("Black");
        toyota.setDoors(4);
        toyota.setConvertible(false);
        toyota.describeCar();
        System.out.println("Model is " + toyota.getModel());

        // car second
        Car bwmX5 = new Car();
        bwmX5.setMake("BWM");
        bwmX5.setModel("X5");
        bwmX5.setColor("White");
        bwmX5.setDoors(2);
        bwmX5.setConvertible(true);
        bwmX5.describeCar();


    }
}
