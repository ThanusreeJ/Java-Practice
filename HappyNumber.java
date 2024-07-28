import java.util.HashSet;
import java.util.Scanner;
public class HappyNumber {
    public static int numSquareSum(int n) {
        int num = 0;
        while (n != 0) {
            int digit = n % 10;
            num += digit * digit;
            n /= 10;
        }
        return num;
    }
    public static boolean isHappyNumber(int n) {
        HashSet<Integer> st = new HashSet<>();
        while (true) {
            n = numSquareSum(n);
            if (n == 1)
                return true;
            if (st.contains(n))
                return false;
            st.add(n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isHappyNumber(num)) {
            System.out.println(num + " is a happy number.");
        } else {
            System.out.println(num + " is not a happy number.");
        }
    }
}

