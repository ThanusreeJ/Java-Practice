 import java.util.Scanner;
public class CharacterTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        for (int r = n; r >= 1; r--) {
            for (int c = r; c <= n; c++) {
                System.out.print((char)(c + 64));
            }
            System.out.println();
        }
    }
}

