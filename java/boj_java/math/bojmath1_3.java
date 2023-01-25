package boj_java.math;

import java.util.Scanner;
import java.util.StringTokenizer;


import java.util.Arrays;
//분수찾기 백준


public class bojmath1_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int number = 1, a, b, aa, bb;
        boolean go = true;
        int sum = 0;
        while(sum < X){
            sum += number;
            number++;
        }
        
        number --;
        sum -= number;
        if(number % 2 == 1){//
            go = false;
        }
        if(go == false){
            a = number;
            b = 1;
            
        }
        else{
            a = 1;
            b = number;
        }
        aa = a;
        bb = b;
        for(int i=0; i<X-sum-1; i++){
            if(aa>bb){
                a --;
                b ++;
            }
            else if(aa<bb){
                a ++;
                b --;
            }
        }
        System.out.printf("%d/%d", a, b);
    }  
}
