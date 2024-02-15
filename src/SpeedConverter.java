public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(10.25);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return (long) Math.round(kilometersPerHour / 1.609d);

    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0)
        {
            System.out.println("Invalid Value");
        } else {
            System.out.print(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
