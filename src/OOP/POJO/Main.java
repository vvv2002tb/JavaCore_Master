package OOP.POJO;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            HUMGStudent s = new HUMGStudent("0" + i, switch (i) {
                case 0 -> "Mary";
                case 1 -> "Vinh";
                case 2 -> "John";
                case 3 -> "Tim";
                case 4 -> "Alex";
                default -> "Anonymous";
            } , "13/04/2002", "Java class");
            System.out.println(s);
        }

        Student pojoStudent = new Student("1", "ABC", "11/11/1111", "Class A");
        HUMGStudent recordStudent = new HUMGStudent("2", "XYZ", "22/22/222", "Class B");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList("Java master");


        System.out.println(pojoStudent.getName() + " is taking "  + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking "  + recordStudent.classList());
    }
}
