package Sorting.StringAnd2D.recursion;

import java.util.Scanner;

public class fibanacci {
    public static int fibonacci(int n){
      
        if(n==0 || n==1){
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String Args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
    
    int a = fibonacci(n);
    System.out.println(a);
    }
}















