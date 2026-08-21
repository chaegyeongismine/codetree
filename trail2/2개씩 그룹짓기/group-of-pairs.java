import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = nums[i]+nums[2*n-1-i];
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
        // Please write your code here.
    }
}