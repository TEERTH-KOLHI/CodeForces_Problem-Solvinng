import java.util.*;
public class Vanya_and_Fence{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), h = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++){
            int k = sc.nextInt();
            if(k > h){
                count += 2;
            }else{
                count += 1;
            }
        }
        System.out.println(count);
    }
}
