import java.util.Scanner;
public class New_Year_and_Hurry{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n+1];
        arr[0] = 0;
        for(int i = 1; i <= n; i++){
            arr[i] = i;
            arr[i] = arr[i]*5;
        }
        int count = 0, check = k;
        for(int i = 1; i <= n; i++){
            if(check <= 240){
                check += arr[i];
                if(check > 240){
                    break;
                }
                count++;
            }
        }
        System.out.println(count);
        
    }
}
