import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        char[] a = word1.toCharArray(), b = word2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        word1 = String.valueOf(a);
        word2 = String.valueOf(b);
        if(word1.equals(word2))
        System.out.print("Yes");
        else 
        System.out.print("No");
        // Please write your code here.
    }
}