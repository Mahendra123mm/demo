public class Exercise15 {

    public static void main(String[] args) {
        double number = 1.5;

        double nextPositive = Math.nextUp(number);
        double nextNegative = Math.nextDown(number);

        System.out.println("Next positive adjacent: " + nextPositive);
        System.out.println("Next negative adjacent: " + nextNegative);
    }
}
