import java.util.Scanner;

public class smallestNumber {
    static int smallest_num(int arr[]){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter number of elements: ");
            int n = sc.nextInt();
            System.out.println("Enter " + n + " elements:");
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Smallest element: " + smallest_num(arr));
            sc.close();
        }
    }
}
