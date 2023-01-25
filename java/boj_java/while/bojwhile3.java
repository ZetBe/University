import java.util.Scanner;
//더하기 사이클 백준

public class bojwhile3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N<10){
            N *= 10;
        }
        int NN = N, NNN = 0, count = 1, sum;
///NN은 원복 복사, NNN은 N에서 10의 나머지, sum은 N의 자릿수의 합
        sum = N%10 + N/10;
        NNN = N%10;
        N = NNN*10 + sum%10;
        while(NN != N){
            sum = N%10 + N/10;
            NNN = N%10;
            N = NNN*10 + sum%10;
           
            count++;
        }
        System.out.println(count);
    }
}