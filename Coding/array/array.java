
package array;
import java.util.Scanner;
public class array {
    


    
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter input");
         int n=sc.nextInt();
         int arr[]=new int[n];
     
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
          
         }
         return arr;
    }
    public static void output(int arr[]){
        int n=arr.length;
      
        int sum=0;
        for(int i=0;i<n;i++){
           
            sum=sum+arr[i];
           
    }
    System.out.print(sum);
}
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
     
         int n=sc.nextInt();
        int i=1;
     while(i<=n){
        int arr[]=takeInput();
        output(arr);
        i++;
     }
  
    
    

}
}
