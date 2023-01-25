import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;
//크로아티아 알파벳 백준

public class bojstring9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int count = 0;
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) == 'c'){
                if(i < S.length()-1){
                    if(S.charAt(i+1) == '='){
                        
                        i++;
                    }
                    else if(S.charAt(i+1) == '-'){
                        
                        i++;
                    }}
            }
            else if(S.charAt(i) == 'd'){
                if(i < S.length()-1){
                    if(S.charAt(i+1) == '-'){
                        
                        i++;
                    }
                    else if(S.charAt(i+1) == 'z'){
                        if(i < S.length()-2){
                            if(S.charAt(i+2) == '='){
                                
                                i+=2;
                         }}
                    }
                }
            }
            else if(S.charAt(i) == 'l'){
                if(i < S.length()-1){
                    if(S.charAt(i+1) == 'j'){
                        
                        i++;
                    }
                }
            }
            else if(S.charAt(i) == 'n'){
                if(i < S.length()-1){
                    if(S.charAt(i+1) == 'j'){
                        
                        i++;
                    }
                }
            }
            else if(S.charAt(i) == 's'){
                if(i < S.length()-1){
                    if(S.charAt(i+1) == '='){
                        
                        i++;
                    }
                }
            }
            else if(S.charAt(i) == 'z'){
                if(i < S.length()-1){
                    if(S.charAt(i+1) == '='){
                        
                        i++;
                    }
                }
            }
            count++;
        }
        
        System.out.println(count);
        
    }  
}
