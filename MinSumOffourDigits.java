import java.util.Arrays;
import java.util.Scanner;
public class MinSumOffourDigits {
    public static int minSum(int num) {
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(digits);
        int num1 = digits[0] * 10 + digits[2];
        int num2 = digits[1] * 10 + digits[3];
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 4-digit number:");
        int number = scanner.nextInt();

        int result = minSum(number);
        System.out.println("The minimum sum of two 2-digit numbers formed from the digits is: " + result);

        scanner.close();
        
    }
}


