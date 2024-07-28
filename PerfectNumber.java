import java.util.Scanner;

public class PerfectNumber {

    public static boolean isPerfectNumber(int num) {
        int factor, sof = 1;
        int sqrt = (int) Math.sqrt(num);
        for (factor = 2; factor <= sqrt; factor++) {
            if (num % factor == 0) {
                sof = sof + factor + num / factor;
            }
        }
        if (sqrt * sqrt == num) {
            sof = sof - sqrt; // Adjust for perfect square numbers
        }
        return num == sof;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
        scanner.close();
    }
}


