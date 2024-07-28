
import java.util.Scanner;

public class CircularNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (isCircular(n1, n2)) {
            System.out.println("Circular");
        } else {
            System.out.println("Not circular");
        }
    }

    private static boolean isCircular(int n1, int n2) {
        int originalN1 = n1;
        int power = 1;
        while (n1 / power > 9) {
            power *= 10;
        }
        do {
            int rem = n1 % 10;
            int quo = n1 / 10;
            n1 = rem * power + quo;

            if (n1 == n2) {
                return true;
            }
        } while (n1 != originalN1);

        return false;
    }
}
