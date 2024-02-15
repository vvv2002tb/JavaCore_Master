package OOP.KeThua;

public class Dog extends Animal{
    private String earType;
    private String tailType;
    public Dog() {
        super("4 leg", "normal", 20);
    }

    public Dog(String type, String size, double weight, String earType, String tailType) {
        super(type, size, weight);
        this.earType = earType;
        this.tailType = tailType;
    }


    @Override
    public void makeNoise() {

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk, run and wag tail");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "earType='" + earType + '\'' +
                ", tailType='" + tailType + '\'' +
                "} " + super.toString();
    }
}
