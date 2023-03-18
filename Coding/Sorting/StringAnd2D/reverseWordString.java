package Sorting.StringAnd2D;

import java.util.Scanner;

public class reverseWordString {

    public static void main(String args[]){

        Scanner dc=new Scanner(System.in);
        String str=dc.nextLine();
        int i=str.length()-1;
        int j=str.length();
        for(i=str.length()-1;i>=0;i--){
          
            if(str.charAt(i)== ' '){
                System.out.print (str.substring(i+1, j)+" ");
                j=i;
            }
        }
        System.out.print (str.substring(0, j)+" ");
       
    }
}
