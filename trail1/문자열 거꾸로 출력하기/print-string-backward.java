import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        do{
            str = sc.next();
            if(str.equals("END")) continue;
            for(int i=str.length()-1; i>=0;i--){
                 System.out.print(str.charAt(i));
                
            }
            System.out.println();

        }while(!str.equals("END"));
        // Please write your code here.
    }
}