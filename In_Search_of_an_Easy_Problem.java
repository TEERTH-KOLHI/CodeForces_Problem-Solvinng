import java.util.*;
public class In_Search_of_an_Easy_Problem{
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 1){
                count++;
            }
        }
        if(count == 0){
            System.out.println("EASY");
        }else{
            System.out.println("HARD");
        }
    }
}
