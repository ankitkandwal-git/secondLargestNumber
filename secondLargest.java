import java.util.Scanner;

public class secondLargest {
    static int second_largest(int arr[],int n){
        int max = arr[0];
        int second_max = -1;
        for(int i=1;i<n-1;i++){
            if(arr[i]>max){
                max = arr[i];
                arr[i] = second_max;
            }
            if(arr[i]>second_max && arr[i]<max){
                second_max = arr[i];
            }
        }
        return second_max;
    }
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter the number: ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Second largest element: " + second_largest(arr, n));
            sc.close();
        }
    }
}
