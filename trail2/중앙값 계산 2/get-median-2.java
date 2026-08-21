import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int midval(int[] a, int end){
        Arrays.sort(a,0, end);
        return a[end/2];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(i%2==0) System.out.print(midval(arr, i+1) + " ");
        }
        
        // Please write your code here.
    }
}