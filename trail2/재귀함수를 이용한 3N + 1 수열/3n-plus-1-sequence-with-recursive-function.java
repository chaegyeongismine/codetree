import java.util.Scanner;
public class Main {
    public static int[] mobile(int[] arr){
        if(arr[0] ==1) return new int[]{0, arr[1]};

        if(arr[0] % 2 == 0) return mobile(new int[]{arr[0]/2, arr[1]+1});
        else return mobile(new int[]{arr[0]*3 +1, arr[1]+1});
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cnt =  mobile(new int[]{n, 0});
        System.out.println(cnt[1]);
        // Please write your code here.
    }
}