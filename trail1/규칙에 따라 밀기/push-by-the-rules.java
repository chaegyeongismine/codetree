import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String man = sc.next();
        for(int i =0; i<man.length(); i++){
            if(man.charAt(i) == 'L') str = str.substring(1)+ str.charAt(0);
            else if(man.charAt(i) == 'R') str = str.charAt(str.length()-1)+ str.substring(0, str.length()-1);

        }
        System.out.println(str);
        // Please write your code here.
    }
}