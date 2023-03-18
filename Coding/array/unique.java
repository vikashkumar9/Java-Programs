package array;
import java.util.Scanner;
  public class unique {
   
    public static int[] takinginput(){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     return arr;
    }
    public static int findunique(int[] arr){
           int n=arr.length;
           int flag=0;
           int a=0;
          for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
             if(i!=j){
              if( arr[i]!=arr[j]){
                  flag=1;
                  }
                  else{
                    flag=0;
                 }
             }
             if(flag==1){
                a=arr[i];
             }
             }  
                 
      }   return a;
      
    }
  
    public static void print(int arr[]){
        int n = arr.length;
        for(int i=1;i< n;i++){
            System.out.print(arr[i] + " ");
        } 
    }
    
    public static void main(String args[]) {
        int arr[] =takinginput();
         int out[]= findunique(arr);
         print(out);
}
}

