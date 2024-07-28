import java.util.Scanner;

public class EvenSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int[] evenNumbers = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            evenNumbers[i] = 2 * (i + 1);
            sum += evenNumbers[i];
        }
        System.out.print("The first " + n + " even numbers are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
        System.out.println("The sum of the first " + n + " even numbers is: " + sum);
    }
}
