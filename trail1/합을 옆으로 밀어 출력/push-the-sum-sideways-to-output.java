import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        String str = Integer.toString(sum);
        str = str.substring(1) + str.charAt(0);
        System.out.print(str);
        // Please write your code here.
    }
}