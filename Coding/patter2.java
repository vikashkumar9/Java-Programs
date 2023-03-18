import java.util.*;
public class patter2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
        int i=1;
       
        while(i<=n){
           int s=1;
            while(s<=n-i){
                
                System.out.print(" ");
                
                s++;
            }
            int j=1;
            int val=i;
            while(j<=i){
                
                System.out.print(val);
                j++;
                val++;
            }
            
            System.out.println(" ");
            i++;
            
        }
       

    }
}
