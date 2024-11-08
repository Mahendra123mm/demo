import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        double number = input.nextDouble();

        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);
        double fourthPower = Math.pow(number, 4);

        System.out.printf("Square: %.2f\n", square);
        System.out.printf("Cube: %.2f\n", cube);
        System.out.printf("Fourth power: %.2f\n", fourthPower);

        input.close();
    }
}
