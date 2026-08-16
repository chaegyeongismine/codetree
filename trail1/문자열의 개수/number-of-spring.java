import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = -1;
        String[] arr = new String[200];
        int i =0;
        while(true){
        arr[i] = sc.next();
        if(arr[i].charAt(0)=='0') break;
        cnt++;
        i++;
        }
        System.out.println(cnt+1);
        for(int a =0; a<=cnt;a++){
            if(a%2==0) System.out.println(arr[a]);
        }
        // Please write your code here.
    }
}