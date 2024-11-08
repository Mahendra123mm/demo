import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input six non-negative digits: ");
        int number = input.nextInt();

        String numberString = Integer.toString(number);

        for (int i = 0; i < numberString.length(); i++) {
            System.out.print(numberString.charAt(i) + " ");
        }

        input.close();
    }
}
