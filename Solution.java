// A. I Wanna Be the Guy

import java.util.*;
public class Solution{
    static Scanner sc = new Scanner(System.in);
    public static void main(String...args){
        int n = sc.nextInt();
        int level = 0;
        int arr[] = new int[n + 1];
        arr[0] = 0;
        meth(arr, level, n);
        
        
    }
    public static void meth(int arr[], int level, int n){
        int p = sc.nextInt();
        for(int i = 0; i < p; i++){
            level = sc.nextInt();
            arr[level] = 1;
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            level = sc.nextInt();
            arr[level] = 1;
        }
        for(int i = 1; i <= n; i++){
            if(arr[i] == 0){
                System.out.println("Oh, my keyboard!");
                return;
            }
        }
        System.out.println("I become the guy.");
        return;
    }
}
