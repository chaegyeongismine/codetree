import java.util.Scanner;                                                                            import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next(), B = sc.next();
        while(A.contains(B)){
            A = A.substring(0, A.indexOf(B))+A.substring(A.indexOf(B)+B.length());
        }
        System.out.println(A);
        // Please write your code here.
    }
}