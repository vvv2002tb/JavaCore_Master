package Abstraction;

import java.util.ArrayList;
import java.util.Objects;

abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move();

    public abstract void bark();

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class Dog extends Animal {


    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move() {
        System.out.println("Move by 4 foot");
    }

    @Override
    public void bark() {
        if (Objects.equals(type, "Wolf")) {
            System.out.println("Howling!... ");
        } else {
            System.out.println("Woof");
        }

    }
}


class Fish extends Animal {

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move() {
        System.out.println("Swimming...");
    }

    @Override
    public void bark() {
        System.out.println("Can't bark.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog mickey = new Dog("Normal", "Big", 30);
        Fish fish = new Fish("Gold", "Small", 0.5);

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(mickey);
        animalArrayList.add(fish);
        System.out.println(animalArrayList);

        System.out.println("-".repeat(10));
        for (Animal animal : animalArrayList
             ) {
            animal.bark();
            animal.move();
        }

        System.out.println("-".repeat(10));
//        mickey.move();
//        mickey.bark();
//        System.out.println(mickey.type);

        doAnimalStuff(mickey);
        System.out.println("-".repeat(10));
        doAnimalStuff(fish);


    }

    private static void doAnimalStuff(Animal animal) {
        animal.move();
        animal.bark();
    }
}
