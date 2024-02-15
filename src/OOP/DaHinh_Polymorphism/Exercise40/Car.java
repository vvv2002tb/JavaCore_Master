package OOP.DaHinh_Polymorphism.Exercise40;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        engine = true;
        wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("Car -> starting.");
    }

    public void accelerate() {
        System.out.println("Car -> accelerating."); // tang toc
    }

    public void brake() {
        System.out.println("Car -> braking."); // phanh
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}

class Mitsubishi extends Car{
    // write code here

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println(this.getClass().getSimpleName() + " -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println(this.getClass().getSimpleName() + " -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println(this.getClass().getSimpleName() + " -> brake()");
    }
}


class Holden extends Car{
    // write code here

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println(this.getClass().getSimpleName() + " -> startEngine()");
    }

    @Override
    public void accelerate() {
        System.out.println(this.getClass().getSimpleName() + " -> accelerate()");
    }

    @Override
    public void brake() {
        System.out.println(this.getClass().getSimpleName() + " -> brake()");
    }
}

