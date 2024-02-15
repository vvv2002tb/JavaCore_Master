package OOP.FormattingAndTextBlock;

public class AllAboutString {
    public static void main(String[] args) {
        String birthDate = "13/04/2002";
        int startingIndex = birthDate.indexOf("2002");
        System.out.println(startingIndex);

        // substring để trích xuất một phần của chuỗi dựa trên các chỉ số cụ thể
        System.out.println("birth year = " + birthDate.substring(startingIndex));

        // get month
        System.out.println("birth month = " + birthDate.substring(3, 5));
        // get day
        System.out.println("birth day = " + birthDate.substring(0, 2));
        // String.join
        String newDate = String.join("-", "13", "04", "2002");
        System.out.println(newDate);

        // concat
        newDate = "13";
        newDate = newDate.concat("/");
        newDate = newDate.concat("04");
        newDate = newDate.concat("/");
        newDate = newDate.concat("2002");

        newDate = "13".concat("/").concat("04").concat("/").concat("2002");

        System.out.println(newDate);
        // replace
        System.out.println(newDate.replace('/', '_'));
        System.out.println(newDate.replace("13", "thirteen"));
        System.out.println(newDate.replace("04", "four"));
        System.out.println(newDate.replace("2002", "Two thousands and two"));

    }
}
