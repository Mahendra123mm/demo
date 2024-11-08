import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the time zone offset to GMT: ");
        int offset = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHourGMT = totalHours % 24;
        long currentHour = (currentHourGMT + offset) % 24;
        if (currentHour < 0) {
            currentHour += 24;
        }

        System.out.printf("Current time is %02d:%02d:%02d\n", currentHour, currentMinute, currentSecond);

        input.close();
    }
}
