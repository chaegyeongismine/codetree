import java.util.Scanner;
public class Main {
    public static int max(int n, int[] arr){
        if(n == 0) return arr[0];
        int temp = max(n-1, arr);
        if(temp<=arr[n]) return arr[n];
        else return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(max(n-1, arr));
        // Please write your code here.
    }
}