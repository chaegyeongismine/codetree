import java.util.Scanner;
class Person{
    String name ;
    String number;
    String city;
    public Person(String name, String number, String city){
        this.name = name;
        this.number = number;
        this.city = city;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        String[] address = new String[n];
        String[] region = new String[n];
        Person[] p = new Person[n];
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            address[i] = sc.next();
            region[i] = sc.next();
        }
        for(int i =0; i<n; i++) p[i] = new Person(name[i], address[i], region[i]);
        Person maxp = p[0];
        for(int i =1; i<n; i++)
            if(maxp.name.compareTo(p[i].name)<0) maxp = p[i];
        
        System.out.printf("name %s\naddr %s\ncity %s", maxp.name, maxp.number, maxp.city);
        // Please write your code here.
    }
}
