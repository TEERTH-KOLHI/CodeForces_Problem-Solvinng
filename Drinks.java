import java.util.*;
public class Drinks{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            int p = sc.nextInt();
            sum += p;
        }
        float ans = (float)sum / n;
        System.out.println(ans);
    }
}
