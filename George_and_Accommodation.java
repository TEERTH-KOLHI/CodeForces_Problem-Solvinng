import java.util.*;
public class George_and_Accommodation{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            if(q-p >= 2){
                count++;
            }
        }
        System.out.println(count);
    }
}
