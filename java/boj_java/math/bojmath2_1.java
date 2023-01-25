package boj_java.math;

import java.util.Scanner;
import java.util.Arrays;
//소수 찾기 백준


public class bojmath2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int count = 0, nums = 0;
        for(int i=0; i<N; i++){
            count = 0;
            A[i] = scanner.nextInt();
            for(int j=1; j<A[i]; j++){
                if(A[i] % j == 0){
                    count++;
                }
            }
            if(count == 1){
                nums ++;
                }
        }
        System.out.println(nums);

    }

}