import java.util.Scanner;
public class reverseNo {
    
public static void main(String args[]) {
    Scanner sc =new Scanner(System.in);
    int n= sc.nextInt();

     while(n>0){
        int k;
        k=n%10;
         if(k>0){
            System.out.print(k);
             }
        n=n/10;
        
     }
    }

}
