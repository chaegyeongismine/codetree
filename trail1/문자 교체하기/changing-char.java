import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        char[] bcopy = b.toCharArray();
        bcopy[0] = a.charAt(0);
        bcopy[1] = a.charAt(1);
        b = String.valueOf(bcopy);
        System.out.print(b);
        // Please write your code here.
    }
}