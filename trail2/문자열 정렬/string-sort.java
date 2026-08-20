import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] a = s.toCharArray();
        Arrays.sort(a);
        s = String.valueOf(a);
        System.out.println(s);
        // Please write your code here.
    }
}