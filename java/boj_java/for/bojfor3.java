import java.util.Scanner;
//합 백준

public class bojfor3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
            
        }
        System.out.println(sum);
    }
}