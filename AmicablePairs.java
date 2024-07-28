import java.util.Scanner;

public class AmicablePairs {

    public static int sumOfFactor(int n) {
        int factor, sof = 1;
        int sqrt = (int) Math.sqrt(n);
        for (factor = 2; factor <= sqrt; factor++) {
            if (n % factor == 0) {
                sof = sof + factor + n / factor;
            }
        }
        if (sqrt * sqrt == n) {
            sof = sof - sqrt;
        }
        return sof;
    }

    public static boolean areAmicablePairs(int n1, int n2) {
        int sof1 = sumOfFactor(n1);
        int sof2 = sumOfFactor(n2);
        return (sof1 == n2 && sof2 == n1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int n1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int n2 = scanner.nextInt();

        if (areAmicablePairs(n1, n2)) {
            System.out.println(n1 + " and " + n2 + " are amicable pairs.");
        } else {
            System.out.println(n1 + " and " + n2 + " are not amicable pairs.");
        }

        scanner.close();
    }
}
