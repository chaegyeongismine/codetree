import java.util.Scanner;
public class Main {
    public static void swap(int n, int[] arr){
        int temp = arr[n];
        arr[n]= arr[n+1];
        arr[n+1] = temp;
    }
    public static void f(int n, int[] arr){
        if(n == arr.length-1) return;
        else {
           if(arr[n] > arr[n+1]) swap (n, arr);
            f(n+1, arr);
            
    }

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        f(0, arr);
        System.out.println(arr[arr.length-1]);
        // Please write your code here.
    }
}