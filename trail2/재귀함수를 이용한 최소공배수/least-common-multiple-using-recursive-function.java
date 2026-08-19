import java.util.Scanner;

public class Main {
    public static int L(int N, int[] a){
        if(N == 0) return a[0];

        int temp = L(N-1, a);
        if(temp < a[N]) {
            int t = temp;
            temp = a[N];
            a[N] = t;
        }
        int i =1;
        while(temp * i % a[N]!=0) i++;
        return temp * i; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print(L(arr.length-1, arr));
        // Please write your code here.
    }
}