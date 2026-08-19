import java.util.Scanner;
public class Main {
    public static int cnt = 0;
    public static int mobile(int N){
        if(N == 1) return 0;
        else if( N % 2 == 0 ) return mobile(N/2) +1;
        else return mobile(N/3) +1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(mobile(n));
        // Please write your code here.
    }
}