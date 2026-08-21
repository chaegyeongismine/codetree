import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        String[] m5bile = new String[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
            if(words[i].length()<t.length()) continue;
            if(words[i].substring(0, t.length()).equals(t))
            m5bile[cnt++] = words[i];
        }
        Arrays.sort(m5bile, 0, cnt);
        System.out.print(m5bile[k-1]);

        // Please write your code here.
    }
}