import java.util.Scanner;

public class largestNumber {
    static int largest(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) { // Fix: should be i < n, not i < n-1
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Largest element: " + largest(arr, n));
        sc.close();
    }
  }
}

