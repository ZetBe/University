import java.util.Scanner;
//구구단 백준

public class bojfor1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=1; i<=9; i++){
            System.out.println(N + " * " + i + " = " + N*i);
        }
    }
}
