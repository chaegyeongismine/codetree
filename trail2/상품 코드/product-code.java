import java.util.Scanner;
class Product {
    String name;
    int code;
    public Product(){
        this.name = "codetree";
        this.code = 50;
    }
    public Product(String name, int code){
        this.name = name;
        this.code = code;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        Product[] p = new Product[2];
        p[0] = new Product();
        p[1] = new Product(id2, code2);
        for(int i = 0; i<2; i++) System.out.println("product " + p[i].code + " is "+p[i].name);
        // Please write your code here.
    }
}