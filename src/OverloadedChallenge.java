public class OverloadedChallenge {
    public static void main(String[] args) {
        System.out.println(area(1));
    }

    public static double convertToCentimeters(int inch) {
        return  inch * 2.54;
    }

    public static double convertToCentimeters(int feet, int inch) {
        return convertToCentimeters(feet * 12 + inch);
    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        return getDurationString(seconds, minutes);
    }

    public static String getDurationString(int seconds, int minute) {

        int hours = minute / 60;

        int remainingSeconds = seconds % 60;
        int remainingMinutes = minute % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds +"s";
    }

    public static double area(double radius) {
        return (radius < 0) ? -1.0 : radius * radius * 3.1415926535897d;
    }

    public static double area(double x, double y) {
        return (x < 0 || y < 0) ? -1.0 : x * y ;
    }
}
