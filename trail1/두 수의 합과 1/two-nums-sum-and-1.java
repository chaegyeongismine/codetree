import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        String C = Integer.toString(A + B);
        int cnt = 0;
        for(int i=0; i<C.length();i++){
            if(C.charAt(i) == '1') cnt++;
        }
        System.out.println(cnt);
        // Please write your code here.
    }
}