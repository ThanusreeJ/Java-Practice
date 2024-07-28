import java.util.Scanner;
public class UglyNumber {
    public static boolean isUgly(int number) {
        if (number <= 0) {
            return false;
        }
        number = divideByGreatestPower(number, 2);
        number = divideByGreatestPower(number, 3);
        number = divideByGreatestPower(number, 5);

        return number == 1;
    }

    public static int divideByGreatestPower(int number, int factor) {
        while (number % factor == 0) {
            number /= factor;
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isUgly(number)) {
            System.out.println(number + " is an ugly number.");
        } else {
            System.out.println(number + " is not an ugly number.");
        }
    }
}

