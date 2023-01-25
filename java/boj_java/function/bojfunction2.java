import java.util.Scanner;


import java.util.Arrays;
//셀프 넘버 백준

public class bojfunction2 {
    public int d(int a){
        int sum = 0;
        for(int i=0; i<4 ; i++){
            if(a > 0){
                sum += a % 10;
                a /= 10;
           }
        }
        return sum;
    }
    public static void main(String[] args){
        int[] a = new int[10000];
        int[] sums = new int[10000];
        bojfunction2 main = new bojfunction2();
        int boo = 1;
        for(int j=1; j<10000; j++){
            a[j] = j;
           
        }
        for(int n=1; n<10000; n++){
            sums[n] = main.d(a[n]);
            sums[n] += a[n];
        }
        for(int b = 1; b<10000; b++){
            for(int c = 1; c< 10000; c++){
                boo = 1;
                if(a[b] == sums[c]){
                    boo = 0;
                    break;
                }
            }
            if(boo == 1){
                System.out.println(a[b]);
            }
        }
        
        
    }
}
