import java.util.Scanner;

public class SumOfFactors {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int sum = sumOfFactor(number);
        System.out.println("Sum of factors of " + number + " is: " + sum);
        scanner.close();
    }
}


