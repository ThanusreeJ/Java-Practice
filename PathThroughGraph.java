import java.util.Scanner;
public class PathThroughGraph {
    public static int largestFactor(int num) {
        int sqt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqt; i++) {
            if (num % i == 0) {
                return num / i;
            }
        }
        return 1;
    }
    public static int pathThroughGraph(int n1, int n2) {
        int count = 0;
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = largestFactor(n1);
            } else {
                n2 = largestFactor(n2);
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number (n1):");
        int n1 = scanner.nextInt();
        System.out.println("Enter the second number (n2):");
        int n2 = scanner.nextInt();
        int result = pathThroughGraph(n1, n2);
        System.out.println("The number of steps to make " + n1 + " equal to " + n2 + " is: " + result);
        scanner.close();
    }
}
