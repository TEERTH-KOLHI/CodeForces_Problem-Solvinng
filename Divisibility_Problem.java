//A. Divisibility Problem

import java.util.*;

public class Divisibility_Problem {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int remainder = a % b;
            if (remainder != 0) {
                int moves = b - remainder;
                System.out.println(moves);
            } else {
                System.out.println(0);
            }
        }
    }
}
