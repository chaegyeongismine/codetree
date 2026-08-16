import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum=0;
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='0'&&ch<='9') sum+= (ch-'0');
        }
        System.out.println(sum);
        // Please write your code here.
    }
}