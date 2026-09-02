import java.util.Scanner;
class bomb{
    String code;
    char color;
    int second;
        public bomb(String code, char color, int second){
            this.code = code;
            this.color = color;
            this.second = second;
        }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        bomb bmb = new bomb(uCode, lColor, time);
        System.out.printf("code : %s\ncolor : %c\nsecond : %d", bmb.code, bmb.color, bmb.second);

        // Please write your code here.
    }
}