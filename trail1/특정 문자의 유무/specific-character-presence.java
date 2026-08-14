import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean exist1 = false;
        boolean exist2 = false;
        for(int i =0; i<str.length() - 1; i++){
            boolean allSame = true;
            if(str.charAt(i) != 'e' || str.charAt(i+1) != 'e') allSame = false;
            if(allSame)   exist1 = true;
        }
         for(int i =0; i<str.length() - 1; i++){
            boolean allSame = true;
            if(str.charAt(i) != 'a' || str.charAt(i+1) != 'b') allSame = false;
            if(allSame)   exist2 = true;
        }
if(exist1) System.out.print("Yes ");
else System.out.print("No ");
if(exist2) System.out.print("Yes ");
else System.out.print("No ");
        // Please write your code here.
    }
}