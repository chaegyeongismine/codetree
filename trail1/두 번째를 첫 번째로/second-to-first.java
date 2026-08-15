import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] strcopy = str.toCharArray();
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(1)) strcopy[i] = str.charAt(0);

        }
        str = String.valueOf(strcopy);
        System.out.print(str);
        // Please write your code here.
    }
}