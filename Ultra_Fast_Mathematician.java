import java.util.*;
public class Ultra_Fast_Mathematician{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        

        String b = sc.nextLine();
        String res = "";
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != b.charAt(i)){
                res += "1";
            }else{
                res += "0";
            }
        }
       
        System.out.println(res);
    }
}
