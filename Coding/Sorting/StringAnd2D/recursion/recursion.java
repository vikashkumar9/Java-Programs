package Sorting.StringAnd2D.recursion;

import java.util.Scanner;

public class recursion {

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String Args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
       int ans= fact(n);
       System.out.println(ans);
    }
    
}
