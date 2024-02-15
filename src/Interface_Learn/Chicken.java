package Interface_Learn;

public class Chicken implements FlightEnabled{
    @Override
    public void takeOff() {
        System.out.println("");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " Always land");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " Some time fly");
    }
}
