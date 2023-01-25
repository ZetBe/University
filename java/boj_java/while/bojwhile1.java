import java.util.Scanner;
import java.util.Arrays;
//A+B -5 백준

public class bojwhile1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A = 1, B = 1;
        while(A != 0 && B != 0){
        A = scanner.nextInt();
        B = scanner.nextInt();
        if(A == 0 && B == 0){
            break;
        }
        System.out.println(A + B);
        }
    }
}
