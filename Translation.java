import java.util.*;
public class Translation{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String temp = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            temp = c + temp;
        }
        if(temp.equals(t)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
