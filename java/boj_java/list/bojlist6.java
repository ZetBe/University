import java.util.Scanner;


import java.util.Arrays;
//OX퀴즈 백준

public class bojlist6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        String[] boos = new String[n];


        for(int i=0; i<boos.length; i++){
            boos[i] = scanner.next();
        }
        for(int j=0; j<boos.length; j++){
            int score = 0, plus = 0;
            for(int a=0; a<boos[j].length(); a++){
                if(boos[j].charAt(a) == 'O'){
                    plus++;
                    score += plus;
                }
                else{
                    plus = 0;
                }
            }
            System.out.println(score);
        }
    }  
}

