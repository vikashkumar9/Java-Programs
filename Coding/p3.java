import java.util.Scanner;
public class p3 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
          char val='A';

        for(int i=1; i<=n ; i++)
        {
            for(int j=1; j<=i; j++)
            {
              System.out.print(val);
            }
            val++;
            System.out.println(" ");
        }
       
    }
    }