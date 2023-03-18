package Sorting;

import java.util.Scanner;
public class rotate {

    public static int[] takinginput(){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     return arr;
    }
    
    public static int[] Zero(int[] arr){
       int k=2;
       int arr2[]=new int[arr.length];
       for(int i=0;i<arr.length;i++){
        arr2[(i+k)%arr.length]=arr[i];
       }
       arr=arr2;
        return arr;
    }

    public static int[] Zeros(int[] arr){
        int k=3;
        
        for(int i=0;i<k;i++){
     
            for(int j=0;j<arr.length-1;j++){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
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
        print(Zeros(arr));
      
    }
}

