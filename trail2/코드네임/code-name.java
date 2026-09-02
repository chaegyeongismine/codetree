import java.util.Scanner;

class User {
    char codeName;
    int score;
    public User(){
        this.codeName = 'a';
        this.score = 0;
    }
}

public class Main {
    public static final int MAX_N = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User[] users = new User[MAX_N];
        for (int i = 0; i < MAX_N; i++) {
            users[i] = new User();
            users[i].codeName = sc.next().charAt(0);
            users[i].score = sc.nextInt();
        }
        User minuser = users[0];
        for(int i =1; i<MAX_N; i++){
            if(minuser.score > users[i].score) minuser = users[i];
        }
        System.out.print(minuser.codeName + " "+minuser.score);

        // Please write your code here.
    }
}
