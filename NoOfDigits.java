import java.util.Scanner;
public class NoOfDigits {
    public static int numberOfDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int digitCount = numberOfDigits(number);
        System.out.println("The number of digits in " + number + " is: " + digitCount);
        scanner.close();
    }
}

