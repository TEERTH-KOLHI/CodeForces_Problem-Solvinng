import java.util.*;
import java.lang.*;
public class Pangram{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Character> set = new HashSet<Character>();
        sc.nextLine();
        String s = sc.nextLine();
        s = s.toLowerCase();
        for(int i = 0; i < n; i++){
            set.add(s.charAt(i));
        }
        if(set.size() == 26){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
}
