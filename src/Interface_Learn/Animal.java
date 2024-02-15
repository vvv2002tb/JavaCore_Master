package Interface_Learn;

interface FlightEnabled {
    public abstract void takeOff();

    abstract void land();

    void fly();

}

interface Trackable {
    default void track() {
        System.out.println("...");
    }
}

public abstract class Animal {
    public abstract void move();
}
