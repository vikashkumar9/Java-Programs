package Sorting.StringAnd2D.recursion;

public class CountZeroes {
    public static int zeroCount(int num)
{
    if(num == 0)
    return 0;

 if(num %10 ==0)
     return 1 + zeroCount(num / 10);
 else
     return zeroCount(num/10); 
}
public static void main(String args[]){

    int num=10;
   System.out.println( zeroCount(num));
}
    
}
