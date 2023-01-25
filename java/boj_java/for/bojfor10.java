import java.util.Scanner;

//별찍기-2 백준

public class bojfor10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=0; i<N; i++){
            for(int o=0; o<N-i-1; o++){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        
    }
}
