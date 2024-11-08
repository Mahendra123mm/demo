import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first integer: ");
        int num1 = input.nextInt();

        System.out.print("Input second integer: ");
        int num2 = input.nextInt();

        int signedComparison = Integer.compare(num1, num2);
        int unsignedComparison = Integer.compareUnsigned(num1, num2);

        if (signedComparison < 0) {
            System.out.println("Signed comparison: " + num1 + " is less than " + num2);
        } else if (signedComparison > 0) {
            System.out.println("Signed comparison: " + num1 + " is greater than " + num2);
        } else {
            System.out.println("Signed comparison: " + num1 + " is equal to " + num2);
        }

        if (unsignedComparison < 0) {
            System.out.println("Unsigned comparison: " + num1 + " is less than " + num2);
        } else if (unsignedComparison > 0) {
            System.out.println("Unsigned comparison: " + num1 + " is greater than " + num2);
        } else {
            System.out.println("Unsigned comparison: " + num1 + " is equal to " + num2);
        }

        input.close();
    }
}
