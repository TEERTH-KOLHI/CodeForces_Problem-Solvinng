import java.util.*;
public class Presents{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        for(int i = 1; i <= n; i++){
            int p = sc.nextInt();
            arr[p] = i;
        }
        for(int i = 1; i <= n; i++){
            if(i == n){
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
