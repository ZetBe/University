package boj_java.math;

import java.util.Scanner;

//ACM호텔 백준


public class bojmath1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] floor = new int[T];
        int[] room = new int[T];
        int[] num = new int[T];
        int[] H = new int[T];
        int[] W = new int[T];
        int[] N = new int[T];
        for(int i=0; i<T; i++){
            H[i] = scanner.nextInt();
            W[i] = scanner.nextInt();
            N[i] = scanner.nextInt();
            floor[i] = N[i]%H[i];
            
            room[i] = (N[i]/H[i])+1;
            if(floor[i] == 0){
                floor[i] = H[i];
                room[i] --;
            }
            num[i] = floor[i]*100 + room[i];
            
            
        }
        for(int j=0; j<T; j++){
            System.out.println(num[j]);
        }
    }  
}
