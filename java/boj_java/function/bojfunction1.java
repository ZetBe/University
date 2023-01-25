import java.util.Scanner;

public class bojfunction1 {
    public long sum(int[] a){
        int n = a.length;
        long b = 0;
        for(int i=0; i<n; i++){
            b += a[i];
        }
        return b;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }
        bojfunction1 mytest = new bojfunction1();
        long c = mytest.sum(a);
        System.out.println(c);
    }
}
