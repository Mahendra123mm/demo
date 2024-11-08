import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");
        long minutes = input.nextLong();

        int minutesInYear = 525600;
        int minutesInDay = 1440;

        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / minutesInDay;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

        input.close();
    }
}
