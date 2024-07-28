import java.util.Scanner;
public class FactorPrinter {
    public static void printFactors(int n) {
        int factor;
        int sqrt = (int) Math.sqrt(n);
        for (factor = 1; factor <= sqrt; factor++) {
            if (n % factor == 0) {
                System.out.print(factor + " "); 
            }
        }
        for (factor = (sqrt * sqrt == n ? sqrt - 1 : sqrt); factor >= 1; factor--) {
            if (n % factor == 0) {
                System.out.print((n / factor) + " "); 
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        printFactors(number);
        scanner.close();
    }
}

