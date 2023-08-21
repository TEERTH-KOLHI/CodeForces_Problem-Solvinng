import java.util.*;
public class Tram{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0, m = 0;
        for(int i = 1; i <= n; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            c = c - a;
            c = c + b;
            if(c > m){
                m = c;
            }
        }
        System.out.println(m);
    }
}
