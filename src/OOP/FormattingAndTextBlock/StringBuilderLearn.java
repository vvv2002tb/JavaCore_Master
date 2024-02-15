package OOP.FormattingAndTextBlock;

public class StringBuilderLearn {
    public static void main(String[] args) {
        String helloWord = "Hello" + " World";
        helloWord.concat("and Goodbye");

        StringBuilder helloWordBuilder =  new StringBuilder("Hello" + " World");
        helloWordBuilder.append(" and Goodbye");

        printInformation(helloWord);
        printInformation(helloWordBuilder);

        StringBuilder empty = new StringBuilder();
        StringBuilder empty2 = new StringBuilder(32); // dung luong ki tu
        empty2.append("a".repeat(33));
        printInformation(empty2);

        empty2.deleteCharAt(2).insert(2, "A");
        empty2.replace(2, 4, "p");


        printInformation(empty);
        printInformation(empty2);
    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());

    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("String = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
