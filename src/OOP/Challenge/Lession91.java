package OOP.Challenge;

public class Lession91 {
    public static void main(String[] args) {
        Student std1 = new Student("Max", 13);
        System.out.println(std1);

        PrimaryStudent std2 = new PrimaryStudent("John", 16, "Harv");
        System.out.println(std2);
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " is " + this.age;
    }
}


class PrimaryStudent extends Student {
    private String parentName;

    public PrimaryStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }


}

