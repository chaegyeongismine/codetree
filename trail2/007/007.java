import java.util.Scanner;
class secret{
    String sCode;
    char mPoint;
    int time;

    public secret(String sCode, char mPoint, int time){
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
    }
}
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        secret secret1 = new secret(sCode, mPoint, time);
        System.out.printf("secret code : %s\nmeeting point : %c\ntime : %d", secret1.sCode, secret1.mPoint, secret1.time);
        // Please write your code here.
    }
}