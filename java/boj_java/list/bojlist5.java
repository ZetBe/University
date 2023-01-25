import java.util.Scanner;

import java.util.Arrays;
//나머지 백준

public class bojlist5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] score = new int[N];
        int big = 0;
        double[] sum = new double[N+1];
        double sumsum = 0;
        for(int i=0; i<N; i++){
            score[i] = scanner.nextInt();
        }
        for(int j=0; j<N; j++){
            if(score[j] > big){
                big = score[j];
            }
        }
        for(int n=0; n<N; n++){
            sum[n] = score[n]/(double)big;
            sumsum += sum[n];
        }
        sumsum = sumsum*100/N;
        System.out.println(sumsum);
        
    }
}
