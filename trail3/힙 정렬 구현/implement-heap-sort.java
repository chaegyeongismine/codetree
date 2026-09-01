import java.util.Scanner;
public class Main {
    public static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    public static void heapify(int[] arr, int n,  int idx){
        int largest = idx;
        int left = 2*idx ;
        int right = 2*idx + 1;

        if(left <=n && arr[left]>arr[largest])
            largest = left;

        if(right<=n && arr[right]>arr[largest])
            largest = right;

        if(largest != idx) {
            swap(arr, idx, largest);
            heapify(arr, n, largest);
        } 
        }
    public static void heap_sort(int[] arr){
        int n = arr.length-1;
        for(int i=n/2; i>=1; i--) heapify(arr,n, i);
        for(int i = n; i>1; i--){
        swap(arr, 1, i);
        heapify(arr, i-1, 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        heap_sort(arr);
        for(int i =1; i<=n; i++) System.out.printf("%d ", arr[i]);
    }
}
