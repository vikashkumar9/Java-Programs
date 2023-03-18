package Sorting.StringAnd2D.recursion;

import java.util.Scanner;

public class printNumber {
    public static void printNumber(int n){
        if(n>0){
         printNumber(n-1) ;
         System.out.println(n);

    }
}
public static int  digit(int n){
   
    if(n==0){
        return 0;
    }
     int ans= digit(n/10);
       return ans+1;
}
    public static void main(String Args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
    
    int a=digit(n);
    System.out.println(a);
    }
}
