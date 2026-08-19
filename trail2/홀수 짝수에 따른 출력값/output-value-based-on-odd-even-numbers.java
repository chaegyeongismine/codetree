import java.util.Scanner;

public class Main {
    public static int sum(int N){
        if(N==1) return 1;
        else if(N ==2) return 2;
        else return sum(N-2) + N;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
        // Please write your code here.
    }
}