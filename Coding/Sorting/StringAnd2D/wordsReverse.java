package Sorting.StringAnd2D;

import java.util.Scanner;

public class wordsReverse {
    
    public static void main(String args[]){

        Scanner dc=new Scanner(System.in);
        String str=dc.nextLine();
       int n=0;
       int j;
      
        for(int i=0; i <str.length(); i++){
        
            if(str.charAt(i)== ' '){
              for(j=i; j>=n;j--){
                System.out.print(str.charAt(j));
                
              }
              n=i+1;
            }
        }
        System.out.print(" ");
        for(j=str.length()-1; j>=n;j--){
            System.out.print(str.charAt(j));
            
          }
       
    }

    
}
