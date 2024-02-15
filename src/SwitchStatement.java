public class SwitchStatement {
    public static void main(String[] args) {
        int value = 4;
        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> { // same or in if else
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actually it was " + value);
            }
            default -> System.out.println("Not 1 or 2, 3, 4, 5");
        }

        System.out.println(getDayType(7));

        char charValue = 'A';
        switch (charValue) {
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C':
                System.out.println("C is charlie");
                break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("E is easy");
                break;
            default:
                System.out.println("Letter " + charValue + " was not found");
                break;
        }

        for (int i = 0; i < 8; i++) {
            printDayOfWeek(i);
        }

    }

    public static String getDayType(int dayOfWeek) {
        return switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> {
                yield "Weekday";
            }
            case 6, 7 -> {
                yield "Weekend";
            }
            default -> {
                yield "Invalid day";
            }
        };
    }

    // sunday is 0. monday is 1; 0 -> 6
    public static void printDayOfWeek(int day)
    {
        String dayOfTheWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println("Value is " + day + " - " + "Day is " + dayOfTheWeek);
    }

}
