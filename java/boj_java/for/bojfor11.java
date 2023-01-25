import java.util.Scanner;
import java.util.Arrays;
//X보다 작은수 백준

public class bojfor11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = scanner.nextInt();
            if(X > A[i]){
                System.out.print(A[i] + " ");
            }
        }

        
    }
}
