import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a floating-point value: ");
        double value = input.nextDouble();

        if (Double.isFinite(value)) {
            System.out.println("The value is a finite floating-point value.");
        } else {
            System.out.println("The value is not a finite floating-point value.");
        }

        input.close();
    }
}
