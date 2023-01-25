import java.util.Scanner;


import java.util.Arrays;
//문자열 반복 백준

public class bojstring4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for(int i=0; i<T; i++){
            int R = scanner.nextInt();
            String S = scanner.next();

            for(int n=0; n<S.length(); n++){
                for(int j=0; j<R; j++){
                   System.out.printf("%c", S.charAt(n));
                }
            
            }
            System.out.print("\n");
        }
    }  
}

