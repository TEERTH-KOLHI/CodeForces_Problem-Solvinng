import java.util.*;
public class Calculating_Function{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        if(n % 2 == 0){
            ans = n / 2;
        }else{
            ans = ((n + 1) / 2) * (-1);
        }
        System.out.println(ans);
    }
}
