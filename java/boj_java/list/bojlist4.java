import java.util.Scanner;

import java.util.Arrays;
//나머지 백준

public class bojlist4
 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] C = new int[42];
        int count = 0;
        for(int i=0; i<10; i++){
            A[i] = scanner.nextInt();
            A[i] %= 42;
        }
        for(int j=0; j<10; j++){
            for(int n=0; n<42; n++){
                if(A[j] == n){
                    C[n] ++;
                }
            }
        }
        for(int a = 0; a<42; a++){
            if(C[a] > 0){
                count++;
            }
        }
        System.out.println(count);
        
    }
}
