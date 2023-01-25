import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;
//상수 백준

public class bojstring7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String As = Integer.toString(A);
        char[] Ass = As.toCharArray();
        char[] re_Ass = new char[As.length()];
        String Bs = Integer.toString(B);
        char[] Bss = Bs.toCharArray();
        char[] re_Bss = new char[Bs.length()];
        String AA = "", BB = "";
        for(int i=0; i<As.length(); i++){
            re_Ass[i] = Ass[As.length()-i-1];
            re_Bss[i] = Bss[Bs.length()-i-1]; 
            AA += Character.toString(re_Ass[i]);
            BB += Character.toString(re_Bss[i]);
        }
        A=Integer.parseInt(AA);
        B=Integer.parseInt(BB);
        if(A>B){
            System.out.println(A);
        }
        else{
            System.out.println(B);
        }
    }  
}
