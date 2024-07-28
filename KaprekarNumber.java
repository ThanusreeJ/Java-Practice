 import java.util.Scanner;
public class KaprekarNumber {
    public static boolean isKaprekar(int num) {
        if (num == 1) {
            return true; 
        }
        int square = num * num;
        String squareStr = Integer.toString(square);
        int len = squareStr.length();
        
        for (int i = 1; i < len; i++) {
            String leftPart = squareStr.substring(0, i);
            String rightPart = squareStr.substring(i);
            
            int left = Integer.parseInt(leftPart);
            int right = Integer.parseInt(rightPart);
            
            if (right != 0 && (left + right == num)) {
                return true;
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        
        if (isKaprekar(number)) {
            System.out.println(number + " is a Kaprekar number.");
        } else {
            System.out.println(number + " is not a Kaprekar number.");
        }
    }
}

