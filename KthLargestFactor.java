import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KthLargestFactor {
    public static ArrayList<Integer> findFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                factors.add(i);
                if (i != number / i) {
                    factors.add(number / i);
                }
            }
        }
        return factors;
    }
    public static int findKthLargestFactor(int number, int k) {
        ArrayList<Integer> factors = findFactors(number);
        Collections.sort(factors, Collections.reverseOrder());
        if (k > 0 && k <= factors.size()) {
            return factors.get(k - 1);
        } else {
            throw new IllegalArgumentException("k is out of bounds.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        System.out.println("Enter a number:");
        int number = scanner.nextInt();       
        System.out.println("Enter k:");
        int k = scanner.nextInt(); 
        try {
            int kthLargestFactor = findKthLargestFactor(number, k);
            System.out.println("The " + k + "-th largest factor of " + number + " is " + kthLargestFactor);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


