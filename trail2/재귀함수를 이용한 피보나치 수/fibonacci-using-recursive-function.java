import java.util.Scanner;

public class Main {
    public static int Fibonacci(int N){
        if(N == 1) return 1;
        else if(N == 2) return 1;
        else 
            return Fibonacci(N-2) + Fibonacci(N-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fibonacci(n));
        // Please write your code here.
    }
}