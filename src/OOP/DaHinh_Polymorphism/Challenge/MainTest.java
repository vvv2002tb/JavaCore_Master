package OOP.DaHinh_Polymorphism.Challenge;

public class MainTest {
    public static void main(String[] args) {
//        Car car = new Car("BWM X5 Black");
//        runRace(car);
        Car ferrari = new GasPoweredCar("2022 Blue Ferrari", 15.4, 6);
        runRace(ferrari);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
