import java.util.Scanner;
public class LargestFactor {
    public static int largestFactor(int num) {
        int sqt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqt; i++) {
            if (num % i == 0) {
                return num / i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int largestFactor = largestFactor(number);
        System.out.println("The largest factor of " + number + " is " + largestFactor);
        scanner.close();
    }
}

