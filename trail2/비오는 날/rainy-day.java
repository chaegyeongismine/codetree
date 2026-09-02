import java.util.Scanner;
class Gisang{
    String date;
    String day;
    String weather;
    public Gisang(String date, String day, String weather){
        this.date=date;
        this.day=day;
        this.weather=weather;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         Gisang[] g = new Gisang[n];
         int cnt = 0;
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            if(weather.equals("Rain"))
            g[cnt++] = new Gisang(date, day, weather);
           
        }
        Gisang lately = g[0];
        for(int i =0 ; i<cnt; i++)  {
            if(lately.date.compareTo(g[i].date)>0 ) lately = g[i];
        }
        System.out.printf("%s %s %s", lately.date, lately.day, lately.weather);
    }
}