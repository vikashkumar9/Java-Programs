
import java .util.Scanner;
public class pattern{
public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    int i=1;
    
    while(i<=n){
    int val=i;
    int j=1;
    while(j<=i)
    {
    System.out.print(val);
    j=j+1;
    val=val+1;

}
i=i+1;
System.out.println();
}
}
}