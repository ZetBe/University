import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;
//단어의 개수 백준

public class bojstring6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(s," ");
        
        System.out.println(st.countTokens());
        
    }  
}

