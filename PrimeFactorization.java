import java.util.Scanner;
public class PrimeFactorization {
    public static void primeFactorization(int n) {
        int pf = 2;
        while (n > 1) {
            if (n % pf == 0) {
                System.out.print(pf + " ");
                while (n % pf == 0) {
                    n = n / pf;
                }
            }
            pf++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        System.out.print("Prime factors of " + number + " are: ");
        primeFactorization(number);
        scanner.close();
    }
}


