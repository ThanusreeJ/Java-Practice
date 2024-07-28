import java.util.Scanner;
public class OddSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int[] oddNumbers = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            oddNumbers[i] = 2 * i + 1;
            sum += oddNumbers[i];
        }
        System.out.print("The first " + n + " odd numbers are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
        System.out.println("The sum of the first " + n + " odd numbers is: " +sum);
    }
}
