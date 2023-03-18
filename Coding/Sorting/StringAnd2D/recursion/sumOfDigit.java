package Sorting.StringAnd2D.recursion;

public class sumOfDigit { 

    public static int  sum(int number){
      if(number==0)
      return 0;

      return (number%10+sum(number/10 ));
     
    }
    public static void main(String args[]){

        int number=2344;
        int a=sum(number);
        System.out.println(a);

    }
    
}
