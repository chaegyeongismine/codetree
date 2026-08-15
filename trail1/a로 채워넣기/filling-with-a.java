import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] b = a.toCharArray();
        b[1]=b[a.length()-2]='a';
        a = String.valueOf(b);
        System.out.print(a);
        // Please write your code here.
    }
}