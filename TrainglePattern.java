import java.util.Scanner;
public class TrainglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = scanner.nextInt();
        
        for (int r = 1; r <= N; r++) {
            int num = r;
            for (int c = N; c >= r; c--) {
                System.out.print(num + " ");
                num = num + c;
            }
            System.out.println();
        }

        scanner.close();
    }
}


