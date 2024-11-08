import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input dividend: ");
        int dividend = input.nextInt();

        System.out.print("Input divisor: ");
        int divisor = input.nextInt();

        // Compute floor division and floor modulus
        int floorDivision = Math.floorDiv(dividend, divisor);
        int floorModulus = Math.floorMod(dividend, divisor);

        // Display results
        System.out.println("Floor division result: " + floorDivision);
        System.out.println("Floor modulus result: " + floorModulus);

        input.close();
    }
}
