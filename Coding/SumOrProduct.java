import java.util.Scanner;
public class SumOrProduct {
    
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int option=sc.nextInt();
        int sum=0;
        int product=1;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            product=product*i;
        }
            if(option==1){
                
                System.out.println(sum);
            }
            else if(option==2){
                   
                   System.out.println(product);
            }
            else{
                System.out.println(-1);
            }
        
    }
}
