import java.util.Scanner;
public class EvenOddSegregation {
    public static void segregateOddEven(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }
            while (arr[right] % 2 != 0 && left < right) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        segregateOddEven(arr);
        System.out.println("Array after segregating even and odd numbers:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

