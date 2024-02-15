package Interface_Learn;

public class Bird extends Animal implements  FlightEnabled, Trackable {
    @Override
    public void move() {
        System.out.println("Flaps wings"); // vỗ cánh
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {

    }


}
