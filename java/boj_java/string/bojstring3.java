import java.util.Scanner;


import java.util.Arrays;
//알파벳 찾기 백준

public class bojstring3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String[] a = new String[S.length()]; 
        int[] abc = new int[26];
        char alpha;
        for(int j=0; j<26; j++){
            abc[j] = -1;
        }
        for(int i=0; i<S.length(); i++){
            a[i] = S.substring(i, i+1);
            alpha = a[i].charAt(0);
            if(abc[(int)alpha-97] == -1){
                abc[(int)alpha-97] = i;
            }
            
        }
        for(int n=0; n<26; n++){
            System.out.print(abc[n] + " ");
        }
        

        }
        
    }