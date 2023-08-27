import java.util.*;
public class Hit_the_Lottery{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        int arr[] = {100, 20, 10, 5, 1};
        for(int i = 0; i < 5; i++){
            answer += n/arr[i];
            n = n % arr[i];
        }
        System.out.println(answer);
    }
}
