import java.util.Scanner;
public class NumericPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r - 1; c++) {
                System.out.print(" ");
            }
            for (int c = r; c <= n; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int r = n - 1; r >= 1; r--) {
            for (int c = 1; c <= r - 1; c++) {
                System.out.print(" ");
            }
            for (int c = r; c <= n; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

