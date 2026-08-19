import java.util.Scanner;
public class Main {
    public static int odd(int N){
        if( N == 1) return 1;
        if(N == 2) return 2;
        return odd(N/3) + odd(N-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(odd(n));
        // Please write your code here.
    }
}