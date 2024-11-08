import java.util.Scanner;

public class code1 {

    public static void main(String[] args) {
        Scanner sc = new scanner(System.in);
        System.out.print("input a degree in fahrenheit: ");
        double Fahrenheit = sc.nextDouble();
        double Celsius = (((5 * Fahrenheit - 32.0) / 9.0));
        System.out.print(Fahrenheit + "degree Fahrenheit is equal to " + Celsius + " in Celsius");

    }
}
