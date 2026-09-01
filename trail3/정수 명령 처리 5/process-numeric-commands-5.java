import java.util.Scanner;
public class Main {
    public static int[] arr = new int[10000];
    public static int cnt = 0;
    public static void size() {
        System.out.println(cnt);
    }

    public static void pop_back(){
        arr[cnt-- -1] = 0;
    }

    public static void push_back(int A) {
        arr[cnt++] = A;
    }

    public static void get(int k){
        System.out.println(arr[k-1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i  = 0; i<n; i++){
            String command = sc.next();
            if(command.equals("push_back")) push_back(sc.nextInt());
            else if(command.equals("pop_back")) pop_back();
            else if(command.equals("size")) size();
            else get(sc.nextInt());
        }
        // Please write your code here.
    }
}