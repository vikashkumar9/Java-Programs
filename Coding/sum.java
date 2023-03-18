

import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
          System.out.println("Enter the number");
		 int n =sc.nextInt();
         int i=0;
         int sum=0;
		while( i<=n)
		{
        if(i%2==0)
         {
	     sum=sum+i;
        }
i=i+2;
		}
     System.out.println(sum);

	}

}