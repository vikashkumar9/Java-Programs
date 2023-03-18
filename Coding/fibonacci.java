import java.util.Scanner;
public class fibonacci {

   public static boolean factorial(int number){
      boolean a=false;
      int f1=0;
      int f2=1;
      int fn=0;
      for(int i=0; i<number; i++){
         fn=f1+f2;
         if(number==fn){
            a= true;
            break;
            }
          else{
           a= false;
           }
         f1=f2;
         f2=fn;
         }
         return a;
   }
   public static void main(String args[]){
    Scanner dc =new Scanner(System.in);
    int number=dc.nextInt();
    boolean a= factorial(number);
   System.out.println(a);
   } 
}
