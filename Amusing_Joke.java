import java.util.*;
public class Amusing_Joke{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(), b = sc.nextLine(), c = sc.nextLine();
        String res = a + b;
        char[] tempStr = res.toCharArray();
        char[] cR = c.toCharArray();
        Arrays.sort(tempStr);
        Arrays.sort(cR);
        res = new String(tempStr);
        c = new String(cR);
        if(res.equals(c)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
