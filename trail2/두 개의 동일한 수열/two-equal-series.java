import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static boolean isSame(int[] a, int[] b, int n){
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i<n; i++){
            if(a[i]!=b[i]) return false; 
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        if(isSame(a, b, n)) System.out.print("Yes");
        else System.out.println("No");

        // Please write your code here.
    }
}