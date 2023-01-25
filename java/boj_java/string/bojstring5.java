import java.util.Scanner;


import java.util.Arrays;
//단어 공부 백준

public class bojstring5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char[] b = new char[a.length()];
        int[] score = new int[91];
        int high = 0, k = 0;
        char high_ch;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z'){
                b[i] = a.charAt(i);
                b[i] -= 32;
            }
            else{
                b[i] = a.charAt(i);
            }
            score[(int)b[i]]++;
        }
        for(int j=65; j<91; j++){
            if(high <= score[j]){
                high = score[j];
                k = j;
                
            }
        }
        for(int z = 65; z<91; z++){
            if(high == score[z] && z != k){
                System.out.println("?");
                break;
            }
            if(z == k){
                high_ch = (char)k;
                System.out.println(high_ch);
                break;
            }
        }
        
    }  
}
