import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> l = new LinkedList<>();
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        for(int i = 0; i<s.length(); i++) l.add(s.charAt(i)); 
        ListIterator<Character> it = l.listIterator(l.size());
        sc.nextLine();
        
        for (int i = 0; i < m; i++) {
            String command = sc.next();
            if(command.equals("L")) {
                if(it.hasPrevious()) it.previous();
            }
            else if(command.equals("R")){
                if(it.hasNext()) it.next();
            }
            else if(command.equals("D") && it.hasNext()) {
                it.next();
                it.remove();
            }
            else if(command.charAt(0)=='P') it.add(sc.next().charAt(0));
        }
        it = l.listIterator();
        while(it.hasNext()) {
            System.out.print(it.next());
        }
        // Please write your code here.
    }
}
