import java.util.Scanner;

public class Main {
    public static int F(int N){
        if (N == 0) return 1;
        else return F(N-1)*N;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(F(n));
        // Please write your code here.
    }
}