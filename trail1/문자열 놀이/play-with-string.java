import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int Q = sc.nextInt();
        for(int i =0; i<Q; i++){
            int select = sc.nextInt();
        if(select ==1){
            int a = sc.nextInt()-1, b = sc.nextInt()-1;
            char[] Scopy = S.toCharArray();
            char temp = Scopy[b];
            Scopy[b] = Scopy[a];
            Scopy[a] = temp;
            S = String.valueOf(Scopy);
            System.out.println(S);
            }
        if(select == 2) {
            char x = sc.next().charAt(0), y = sc.next().charAt(0);
            char[] Scopy = S.toCharArray();
            for(int j=0; j<S.length(); j++){
                if(Scopy[j]==x) Scopy[j] = y; 
            }
            S = String.valueOf(Scopy);
            System.out.println(S);
        }
        }

        // Please write your code here.
    }
}