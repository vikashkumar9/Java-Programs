package Sorting.StringAnd2D;

import java.util.Scanner;

public class removeConsecutiveDuplicate {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        
          String a = "";
          int b=str.length()-1;
        for(int i=0;i<b;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
              a=a+str.charAt(i);
            }
        }
        System.out.println(a);

    }
    
}
