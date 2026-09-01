import java.util.Scanner;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            if(command.equals("push_front")){
                int A = sc.nextInt();
                l.addFirst(A);
            }
            else if(command.equals("push_back")){
                int A = sc.nextInt();
                l.addLast(A);
            }
            if(command.equals("pop_front")){
                System.out.println(l.pollFirst());
            }
            if(command.equals("pop_back")){
                System.out.println(l.pollLast());
            }
            if(command.equals("size")){
                System.out.println(l.size());
            }
            if(command.equals("empty")){
                if(l.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
            if(command.equals("front")){
                System.out.println(l.peekFirst());
            }
            if(command.equals("back")){
                System.out.println(l.peekLast());
            }
            // Please write your code here.
        }
    }
}