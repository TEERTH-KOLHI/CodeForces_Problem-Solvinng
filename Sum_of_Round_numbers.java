import java.util.Scanner;
public class Sum_of_Round_numbers{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = t; i > 0; i--){
            int n = sc.nextInt();
            int total = 0, m = 1;
            int arr[] = new int[6];
            for(int j = 1; j < 6; j++){
                arr[j] = n % 10;
                n = n / 10;
                if(arr[j] != 0){
                    total++;
                }
            }
            System.out.println(total);
            for(int j = 1; j < 6; j++){
                if(arr[j] != 0){
                    System.out.print(arr[j]*m + " ");
                }
                m = m*10;
            }
            
        }
    }
}
