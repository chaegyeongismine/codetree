
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                    String[] A = new String[2];
                            A[0] = sc.next(); A[1] = sc.next();
                                    int[] a = new int[2];
                                            for(int k =0;k<2;k++){
                                                    String temp = "";
                                                            for(int i =0; i<A[k].length(); i++){
                                                                    char ch = A[k].charAt(i);
                                                                            if(ch<'0'||ch>'9') continue;
                                                                                    temp += ch;
                                                                                            }
                                                                                                    a[k] = Integer.parseInt(temp);
                                                                                                            }
                                                                                                                    System.out.println(a[0]+a[1]);
                                                                                                                            // Please write your code here.
                                                                                                                                }
                                                                                                                                }
