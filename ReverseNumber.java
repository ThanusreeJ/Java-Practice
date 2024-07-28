import java.util.Scanner;
public class ReverseNumber {
    public static int reverseNumber(int n) {
        int revNum = 0;
        while (n != 0) {
            int d = n % 10;
            revNum = revNum * 10 + d;
            n = n / 10;
        }
        return revNum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int reversedNumber = reverseNumber(number);
        System.out.println("The reverse of " + number + " is: " + reversedNumber);
        scanner.close();
    }
}
