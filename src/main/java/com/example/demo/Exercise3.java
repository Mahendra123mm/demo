import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int number = input.nextInt();

        // Check if the number is within the valid range
        if (number < 0 || number > 1000) {
            System.out.println("Please enter a valid integer between 0 and 1000.");
        } else {
            int sum = 0;
            int tempNumber = number; // Keep the original number for display

            // Sum the digits of the number
            while (tempNumber > 0) {
                sum += tempNumber % 10; // Add the last digit to sum
                tempNumber /= 10; // Remove the last digit
            }

            System.out.println("The sum of all digits in " + number + " is: " + sum);
        }

        input.close();
    }
}
