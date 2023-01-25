package boj_java.math;
import java.util.Scanner;
import java.util.Arrays;
//소수 백준


public class bojmath2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int count, nums = 0, small = 0;
        for(int i=M; i<=N; i++){
            count = 0;
            for(int j=1; j<i; j++){
                if(i % j == 0){
                    count ++;
                }
            }
            if(count == 1){
                nums+=i;
                if(nums == i){
                    small = i;
                }
            }
        }
        if(nums == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(nums);
            System.out.println(small);
        }
    }

}
