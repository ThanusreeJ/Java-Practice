import java.util.Scanner;
public class findPower {
    public static int findPower(int base, int expo) {
        int res = 1;
        for (int i = 1; i <= expo; i++) {
            res = res * base;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base:");
        int base = scanner.nextInt();
        System.out.println("Enter the exponent:");
        int expo = scanner.nextInt();

        int result = findPower(base, expo);
        System.out.println(base + " raised to the power of " + expo + " is: " + result);

        scanner.close();
    }
}

