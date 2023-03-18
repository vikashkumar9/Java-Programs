package Sorting;


import java.util.Scanner;
public class zerOne {

    public static int[] takinginput(){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     return arr;
    }
  
    public static int[] shortfun(int arr[]){
         int s=0;
         int m=0;
         int l=arr.length-1;

         while(m<=l){
            if(arr[m]==0){
                int temp=arr[m];
                arr[m]=arr[s];
                arr[s]=temp;
               m++;
               s++;
            }
            else if(arr[m]==1){
                m++;
            }else{
                int temp=arr[m];
                arr[m]=arr[l];
                arr[l]=temp;
                l--;
            }
         }
      return arr;
    }
    
    
    public static void print(int arr[]){
        int n = arr.length;
        for(int i=0;i< n;i++){
            System.out.print(arr[i] + " ");
        } 
    }
    
    public static void main(String args[]) {
        //int arr[]=new int[n];
        

        int arr[] =takinginput();
        // print(Zeros(arr));
        print(shortfun(arr));

      
    }
}


    
    