import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        String s = br.readLine();
        LinkedList<Character> l = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            l.add(s.charAt(i));
        }
        
        // 커서를 리스트 맨 뒤에 배치 ($O(1)$)
        ListIterator<Character> it = l.listIterator(l.size());
        
        for (int i = 0; i < m; i++) {
            String command = br.readLine();
            char c = command.charAt(0);
            
            if (c == 'L') {
                if (it.hasPrevious()) it.previous();
            } else if (c == 'R') {
                if (it.hasNext()) it.next();
            } else if (c == 'D') {
                if (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            } else if (c == 'P') {
                it.add(command.charAt(2));
            }
        }
        
        // StringBuilder에 결과를 전부 담아 한 번에 출력
        StringBuilder sb = new StringBuilder();
        for (char ch : l) {
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}