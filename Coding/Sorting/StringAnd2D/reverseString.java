package Sorting.StringAnd2D;

import java.util.Scanner;


public class reverseString{

    public static String substring(String str){
    int i=str.length()-1;
    int j=str.length();
    String result=" ";
    while(i>0){
        if(str.charAt(i)==' '){
            result=result+str.substring(i+1, j )+" ";
            j=i;
        }
        i--;
    }  
    result=result+str.substring(0, j);
    
   
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       String ans= substring(str);
       System.out.println(ans);
    }
    
}
