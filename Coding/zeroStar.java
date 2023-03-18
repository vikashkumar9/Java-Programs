import java.util.Scanner;
public class zeroStar {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                if(i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(0);
    
                }
            }
            System.out.print("*");

           for(int j=rows;j>0;j--){
            if(i==j){
                System.out.print("*");
            }
            else{
                System.out.print(0);

            }
           }
           System.out.println(" ");
        }
    }
    
}
