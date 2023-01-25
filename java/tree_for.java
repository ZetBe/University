public class tree_for {
    public static void main(String[] args) {
        int a = 24, b = 56, gcd = 1, result;
        int aa = a, bb = b;
        if(a > b){
            while(aa >= 0){
                aa -= bb;
            }
            aa += bb;
            gcd = aa;
        }
        if(b > a){
            while(bb >= 0){
                bb -= aa;
            }
            bb += aa;
            gcd = bb;
        }
       result = a * b / gcd;
       System.out.println(result);
    }
}