import java.util.Scanner;
//import java.lang.Math;
public class bTod {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        double ans=0;
        
        int i=0;
        while(n!=0){
         int decimal=n%10;
         
         if(decimal==1){
         ans= ans + Math.pow(2,i);
         }
         n=n/10;
         i++;
        }
        int value = (int)ans;
        System.out.print(value);

    }
}