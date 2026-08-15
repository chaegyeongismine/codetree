import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0), b = sc.next().charAt(0);
        
        System.out.print((int)(a+b)+" "+(a-b>=0 ? (int)(a-b): (int)(b-a)));
        // Please write your code here.
    }
}