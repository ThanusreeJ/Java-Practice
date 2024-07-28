import java.util.Scanner;
public class SumOfDigits {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum = sum + d;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int digitSum = sumOfDigits(number);
        System.out.println("The sum of digits of " + number + " is: " + digitSum);
        scanner.close();
    }
}
