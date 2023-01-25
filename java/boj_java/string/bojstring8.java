import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;
//다이얼 백준

public class bojstring8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int a, score = 0;
        char[] let = new char[word.length()];
        for(int i=0; i<word.length(); i++){
            let[i] = word.charAt(i);
            if((int)let[i]-65 < 16){
                a = ((int)let[i] - 62)/3 + 1;
                score += a+1;
            }
            if((int)let[i] < 84 && (int)let[i] > 80){
                score += 8;
            }
            if((int)let[i] < 87 && (int)let[i] > 83 ){
                score += 9;
            }
            if((int)let[i] < 91 && (int)let[i] > 86){
                score += 10;
            }
        }
        System.out.println(score);
    }  
}
