import java.util.Scanner;

import java.util.Arrays;
//숫자의 개수 백준

public class bojlist3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int abc = A*B*C, i = 0;
        int[] nums = new int[20];
        int[] score = new int[10];
        while(true){
            nums[i] = abc%10;
            abc /= 10;
            i++;
            if(abc == 0){
                break;
            }
        }
        int a = i;
        for(i = a; i >= 0; i-- ){
            if(nums[i] == 0){
                score[0]++;
            }
            else if(nums[i] == 1){
                score[1]++;
            }
            else if(nums[i] == 2){
                score[2]++;
            }
            else if(nums[i] == 3){
                score[3]++;
            }
            else if(nums[i] == 4){
                score[4]++;
            }
            else if(nums[i] == 5){
                score[5]++;
            }
            else if(nums[i] == 6){
                score[6]++;
            }
            else if(nums[i] == 7){
                score[7]++;
            }
            else if(nums[i] == 8){
                score[8]++;
            }
            else if(nums[i] == 9){
                score[9]++;
            }
        }
        score[0]--;
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score[3]);
        System.out.println(score[4]);
        System.out.println(score[5]);
        System.out.println(score[6]);
        System.out.println(score[7]);
        System.out.println(score[8]);
        System.out.println(score[9]);
        
    }
}
