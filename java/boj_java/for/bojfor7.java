import java.util.Scanner;

//A+B-7 백준

public class bojfor7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=1; i<=N; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int sum = A+B;
            System.out.println("Case #" + i + ": " + sum);
        }

        
    }
}
