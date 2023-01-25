package boj_java.math;

import java.util.Scanner;
import java.util.Arrays;
//부녀회장이 될테야 백준


public class bojmath1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0; i<T; i++){
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int[] floor = new int[n+1];
            int[] people = new int[n+1];
            int sum;
            for(int b=1; b<n+1; b++){
                    sum = b;
                    floor[b] = sum;
                }
            for(int v=0; v<k; v++){
                for(int c=1; c<n+1; c++){//밑에층 사람들 더함
                    people[c] = 0;
                    for(int d=1; d<c+1; d++){
                        people[c] += floor[d];
                    }
                    
                }
                for(int m=1; m<n+1; m++){
                    floor[m] = people[m];
                }
            }
            System.out.println(people[n]);

        }
    }  
}

