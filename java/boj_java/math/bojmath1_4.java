package boj_java.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

//달팽이는 올라가고 싶다 백준


public class bojmath1_4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        
        int days = 0;
        int day = A-B;
        
        days = (V-B)/day;
        if((V-B) % day != 0){
            days+=1;
        }
       
        
        System.out.println(days);
        br.close();
        
    }  
}
