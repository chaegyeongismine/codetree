import java.util.Scanner;
public class Main {
    public static int F(int N){
        if(N == 1) return 2;

        if(N==2) return 4;

        return F(N-2) * F(N-1) % 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(F(n));
        // Please write your code here.
    }
}