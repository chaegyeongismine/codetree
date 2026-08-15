import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] k = new char[a.length()];
        for(int i=0; i<a.length(); i++){
            if(a.charAt(0)==a.charAt(i)) k[i] = a.charAt(1);
            else if(a.charAt(1) == a.charAt(i)) k[i] = a.charAt(0);
            else k[i] = a.charAt(i); 
        }
        a = String.valueOf(k);
        System.out.print(a);
        // Please write your code here.
    }
}