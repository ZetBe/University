package boj_java.math;
import java.util.Scanner;
import java.util.Arrays;
//소인수분해 백준


public class bojmath2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = N;
        for(int i=2; i<=N+1; i++){
            if(N == 1){
                break;
            }
            if(M % i == 0){
                System.out.println(i);
                M /= i;
                i = 1;
            }
            if(M == i){
                break;
            }
        }
        
    }

}