package OOP.FormattingAndTextBlock;

public class Main {
    public static void main(String[] args) {
        String textBlock = """
                Chủ để 1:
                    + bài 1
                        - Ví dụ 1.1
                """;
        System.out.println(textBlock);

        int age = 20;
        System.out.printf("Vinh is %d years old.", age);
        System.out.println();

        String dateBirth = "13";
        String monthBirth = "04";
        String yearBirth = "2002";
        System.out.printf("Your birthday is %s-%s-%s.", dateBirth, monthBirth, yearBirth);
        System.out.println();

        double number = 12.21212712712;
        System.out.printf("Get 2 numbers after %.2f", number);
        System.out.println();

        String formatString = String.format("Your age is %d.",  age);
        String formatString2 = "Your age is %d.".formatted(age);
        System.out.println(formatString);
        System.out.println(formatString2);
    }
}
