import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String a = sc.next();
        int x = str.indexOf(a);
        if(x != -1) System.out.print(x);
        else System.out.print("No");

        // Please write your code here.
    }
}