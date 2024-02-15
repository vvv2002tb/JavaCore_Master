package OOP.FormattingAndTextBlock;

public class StringMore {
    public static void main(String[] args) {
        printInformation("Hello world");
//        printInformation("");
        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of last l = %d %n", helloWorld.lastIndexOf('l'));
        String empty = ""; // nếu cách ra nó ko tính là is empty
        if (empty.isEmpty()) {
            System.out.println("String is empty");
        }
        System.out.println("-------------");
        String helloWorldLowerCase = helloWorld.toLowerCase();

        if (helloWorld.equals(helloWorldLowerCase)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (helloWorld.equalsIgnoreCase(helloWorldLowerCase)) {
            System.out.println("Same with ignore case");
        } else {
            System.out.println("Not match");
        }

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String start with Hello");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String end with World");
        }

        if (helloWorld.contains("Hello")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Match");
        }




    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));

//        for (int i = 0; i < length; i++) {
//            System.out.printf("%c", string.charAt(i));
//        }

        if (string.isEmpty()) {
            System.out.println("String is empty");
        }
    }
}
