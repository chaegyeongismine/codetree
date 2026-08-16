import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'||Character.isDigit(ch)){
                if(ch>='A'&&ch<='Z') ch= (char)(ch+32);
                System.out.print(ch);
            }
        }
        // Please write your code here.
    }
}