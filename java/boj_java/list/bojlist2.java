import java.util.Scanner;
import java.util.Arrays;
//X보다 작은수 백준

public class bojlist2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = 9;
        int big = 0, big_lar = -1 ;
        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = scanner.nextInt();
        }
        for(int j=0; j<N; j++){
            if(A[j] > big){
                big = A[j];
                big_lar = j;
            }
        }

        System.out.println(big);
        System.out.println(big_lar+1);
    }
}
