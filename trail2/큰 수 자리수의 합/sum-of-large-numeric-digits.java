import java.util.Scanner;
public class Main {
    public static int gak(int N){
        if(N<10) return N;

        return gak(N/10) + N%10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(gak(a*b*c));
        // Please write your code here.
    }
}