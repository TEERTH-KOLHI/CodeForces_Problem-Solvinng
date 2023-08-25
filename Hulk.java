import java.util.*;
public class Hulk{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isTrue = false;
        while(n > 0){
            if(!isTrue){
                System.out.print("I hate ");
                isTrue = true;
            }else{
                System.out.print("I love ");
                isTrue = false;
            }
            if(n > 1){
                System.out.print("that ");
            }else{
                System.out.print("it ");
            }
            n--;
        }
    }
}
