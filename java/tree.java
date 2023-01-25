public class tree {
    public static void main(String[] args) {
       for(int i = 0; i<5; i++){
           for(int a=0; a<5-i; a++){
               System.out.print(" ");
           }
           for(int j=1; j<=i; j++){
               System.out.print("*");
           }
           for(int b=0; b<i; b++){
               if(b>0){
                   System.out.print("*");
               }
           }
           System.out.println();
       }
}
}