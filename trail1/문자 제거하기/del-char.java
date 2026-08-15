import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        for(int i=0; i< length-1; i++){
            int idx = sc.nextInt();
            if(idx >str.length()-1){
                str = str.substring(0, str.length()-1);

            }
            else str = str.substring(0, idx) + str.substring(idx+1);
            System.out.println(str);
        }

        // Please write your code here.
    }
}