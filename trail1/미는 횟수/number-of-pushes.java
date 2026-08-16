import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next(), B = sc.next();
        int N = 0;
        for(int i=0; i<A.length();i++){
        A = A.substring(A.length()-1) + A.substring(0, A.length()-1);
       N++;
    
       if(A.equals(B)) break;
        }
        if(N !=A.length() ) System.out.print(N);
        else System.out.print(-1);
        // Please write your code here.
    }
}