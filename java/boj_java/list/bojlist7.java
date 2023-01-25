import java.util.Scanner;


import java.util.Arrays;
//평균은 넘겠지 백준

public class bojlist7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        int people = 0;
        int[] mean = new int[C];
        double[] sum = new double[C];
        for(int i = 0; i<C; i++){
            int N = scanner.nextInt();
            int[] score = new int[N];
            for(int j = 0; j<N; j++){
                score[j] = scanner.nextInt();
            }
            for(int n = 0; n<N; n++){
                mean[i] += score[n];
            }
            mean[i] /= N;
            for(int a = 0; a<N; a++){
                if(mean[i] < score[a]){
                    people ++;
                }
            }
            sum[i] = (double)people / N;
            people = 0;
            
        }
        for(int b = 0 ; b<C; b++){
            System.out.println(String.format("%.3f", sum[b]*100) + "%");
        }
    }
}
