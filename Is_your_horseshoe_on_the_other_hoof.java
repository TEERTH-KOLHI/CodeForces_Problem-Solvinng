import java.util.*;
public class Is_your_horseshoe_on_the_other_hoof{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 1; i <= 4; i++){
            int si = sc.nextInt();
            set.add(si);
        }
        System.out.println(4-set.size());
    }
}
