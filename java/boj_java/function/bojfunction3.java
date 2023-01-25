import java.util.Scanner;


import java.util.Arrays;
//한수 백준

public class bojfunction3 {
    public int different(int N){
        int[] num = new int[4];
        int boo, dif1, dif2;
        for(int i=0; i<4 ; i++){
            if(N > 0){
                num[i] = N%10;
                N /= 10;
           }
        }
        dif1 = num[0] - num[1];
        dif2 = num[1] - num[2];
        if(dif1 == dif2 ){
            boo = 1;
        }
        else{
            boo = 0;
        }

        if(num[3] != 0){
            boo = 0;
        }
        if(num[2] == 0 && num[3] == 0){
            boo = 1;
        }
        return boo;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int han = 0, a;
        bojfunction3 main = new bojfunction3();
        for(int i= 1; i <= N; i++){
            a = main.different(i);
            han += a;
            }
        System.out.println(han);
        }
        
    }
