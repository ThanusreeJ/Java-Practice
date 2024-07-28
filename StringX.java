import java.util.Scanner;
public class StringX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int len = str.length();
        
        for (int r = 0; r < len; r++) {
            for (int c = 0; c < len; c++) {
                if (r == c || (r + c) == len - 1) {
                    System.out.print(str.charAt(c));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

