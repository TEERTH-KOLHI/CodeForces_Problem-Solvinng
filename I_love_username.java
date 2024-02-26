//155A
import java.util.Scanner;
public class Solution{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int best = 0, worst = 0, count = 0;
        best = sc.nextInt();
        worst = best;
        for(int i = 1; i < n; i++){
            int a = sc.nextInt(); 
            if(a < worst){
                worst = a; 
                count++; 
            }
            if(a > best){
                best = a;
                count++; 
            }
        }
        System.out.println(count);
    }
}
