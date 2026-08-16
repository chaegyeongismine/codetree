import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String A = sc.next();
        int cnt =0;
        for(int i =0; i<N; i++){
            if(A.equals(sc.next())) cnt++;
        }
        System.out.println(cnt);
        // Please write your code here.
    }
}