import java.util.Scanner;
import java.util.Arrays;
//최소, 최대 백준

public class bojlist1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int big = -10000000, small = 10000000;
        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = scanner.nextInt();
        }
        for(int j=0; j<N; j++){
            if(A[j] > big){
                big = A[j];
            }
            if(A[j] < small){
                small = A[j];
            }
        }

        System.out.println(small + " " + big);
    }
}
