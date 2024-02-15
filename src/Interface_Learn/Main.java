package Interface_Learn;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        FlightEnabled chicken = new Chicken();

        animal.move();
//        flier.move();
//        tracked.move();
        flier.takeOff();
        tracked.track();

        chicken.fly();
        chicken.land();

    }
}
