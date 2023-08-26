// A. Arrival of the General

import java.util.*;
public class Arrival_of_the_General{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max_value = 0, min_value = 200;
        int min_idx = 0, max_idx = 0;
        for(int i = 1; i <= n; i++){
            int a = sc.nextInt();
            if(a > max_value){
                max_idx = i;
                max_value = a;
            }
            if(a <= min_value){
                min_idx = i;
                min_value = a;
            }
        }
        if(max_idx > min_idx){
            System.out.println((max_idx - 1) + (n - min_idx) - 1);
        }else{
            System.out.println((max_idx - 1) + (n - min_idx));
        }
    }
}
