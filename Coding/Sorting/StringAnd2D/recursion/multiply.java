package Sorting.StringAnd2D.recursion;

import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class multiply {
    

    public static int multiply(int n,int m){
     if(m==0||n==0){
        return 0;
     }
     return n+ multiply(n, m-1);
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first number");
       int n=sc.nextInt();
       System.out.println("Enter the second number");
       int m=sc.nextInt();
        int a=multiply(n,m);
        System.out.println(a);
    }
}
