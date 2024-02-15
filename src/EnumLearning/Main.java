package EnumLearning;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfWeek weekDay = DayOfWeek.TUES;
        System.out.println(weekDay);

        System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());


        System.out.println(getRandomDay());

        
    }

    public static DayOfWeek getRandomDay() {
        int random = new Random().nextInt(7);
        var allDays = DayOfWeek.values();

        return allDays[random];
    }
}
