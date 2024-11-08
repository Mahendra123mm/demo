import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Input height in inches: ");
        double heightInInches = input.nextDouble();

        double weightInKg = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        System.out.println("Body Mass Index is " + bmi);

        input.close();
    }
}
