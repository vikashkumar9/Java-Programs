package array;

import java.util.Scanner;
import java.util.Scanner; 
public class arr2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();

       int s=1;
       
       int arr[]=new int[50];
       int arr2[]=new int[50];
       
       
       int e=arr.length-1;
        arr[e]=2;
        for(int i=s;i<=n/2;i+=2){
            arr[i]=i;
        }
        for(int j=e;j>n/2;j-=2){
            arr2[j]=j;
            
        }
        
        
        // for(int i=0;i<=n;i++){
        //     System.out.println(arr[i]);
        // }
        for(int i=0;i<=n;i++){
            System.out.println(arr2[i]);
        }
        
    }
    
}
