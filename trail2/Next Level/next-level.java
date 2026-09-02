import java.util.Scanner;
class Student{
    String id;
    int level;
    public Student(String id, int level){
        this.id = id;
        this.level = level;
    }
    public Student(){
        this.id = "";
        this.level = 0;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        Student std1 = new Student("codetree", 10);
        Student std2 = new Student();
        std2.id = id;
        std2.level = level;
        System.out.printf("user %s lv %d\n",std1.id, std1.level );
        System.out.printf("user %s lv %d", std2.id, std2.level);
        // Please write your code here.
    }
}