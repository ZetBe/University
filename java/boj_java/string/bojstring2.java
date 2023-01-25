import java.util.Scanner;


import java.util.Arrays;
//아스키코드 백준

public class bojstring2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String Ns = scanner.next();
        int sum = 0;
        for(int i=0; i<N; i++){
            sum += Integer.parseInt(Ns.substring(i, i+1));
        }

        System.out.println(sum);
        }
        
    }