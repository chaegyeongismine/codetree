import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int Q = sc.nextInt();
        for(int i =0; i<Q; i++){
            int q = sc.nextInt();
            if(q==1) str = str.substring(1) + str.charAt(0);
                
        
            else if(q==2) str = str.charAt(str.length()-1)+str.substring(0, str.length()-1);

            
            else if(q==3) {char[] strcopy = str.toCharArray();
            if(str.length()%2 != 0) { 
            for(int j =0; j<(str.length()+1)/2;j++) {
                char temp = strcopy[j];
                strcopy[j] = strcopy[str.length()-1-j];
                strcopy[str.length()-1-j] = temp;
                
            }
            str = String.valueOf(strcopy);
            } 
            else {
                for(int j =0 ; j< str.length()/2; j++){
                    char temp = strcopy[j];
                    strcopy[j] = strcopy[str.length()-1-j];
                    strcopy[str.length()-j-1] = temp;   
            }
             str = String.valueOf(strcopy);
            }}

            System.out.println(str);
        
        }

        // Please write your code here.
    }
}