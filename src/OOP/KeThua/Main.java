package OOP.KeThua;

public class Main  {
    public static void main(String[] args) {
        Animal animal = new Animal("Bò sát", "small", 2);
        doAnimalStuff(animal, "fast");

        Dog milu = new Dog();
        doAnimalStuff(milu, "fast");

        Dog cun = new Dog("Chó cảnh", "small", 10, "tai cụp", "đuôi ngắn");
        doAnimalStuff(cun, "slow");

        Fish goldFish = new Fish("gold fish", 0.5, 100, 2);
        doAnimalStuff(goldFish, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("---------");

    }
}
