import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input distance in meters: ");
        double distanceMeters = input.nextDouble();

        System.out.print("Input hour: ");
        int hours = input.nextInt();

        System.out.print("Input minutes: ");
        int minutes = input.nextInt();

        System.out.print("Input seconds: ");
        int seconds = input.nextInt();

        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        double metersPerSecond = distanceMeters / totalSeconds;
        double kilometersPerHour = (distanceMeters / 1000.0) / (totalSeconds / 3600.0);
        double milesPerHour = (distanceMeters / 1609.0) / (totalSeconds / 3600.0);

        System.out.printf("Your speed in meters/second is %.8f\n", metersPerSecond);
        System.out.printf("Your speed in km/h is %.8f\n", kilometersPerHour);
        System.out.printf("Your speed in miles/h is %.8f\n", milesPerHour);

        input.close();
    }
}
