package array;
import java.util.Scanner;
  public class auniqe {
   
    public static int[] takinginput(){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     return arr;
    }
    // public static int findunique(int[] arr ){
    //       int ans =0;
    //       int n=arr.length;
    //       for(int i=0;i<n;i++){
    //         ans=ans^arr[i];
    //       } 
    //       return ans;
    // }
    
     public static int duplicate(int arr[])  
{  
    int n=arr.length;
    
    for(int i = 0; i < n; i++) {  
        for(int j = i + 1; j < n; j++) {  
            if(arr[i] == arr[j])  
            return (arr[i]);  
        }  
    }  
    return 0;  
}  

  
    public static void print(int arr[]){
        int n = arr.length;
        for(int i=0;i< n;i++){
            System.out.print(arr[i] + " ");
        } 
    }
    
    public static void main(String args[]) {
        int arr[] =takinginput();
        // System.out.println(findunique(arr)); 
         System.out.println(duplicate(arr)); 
         
    }
}

