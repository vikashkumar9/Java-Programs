package Sorting;

import java.util.Scanner;
public class ShiftingZeroes {

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
       int count=0;
        for(int i=0;i<arr.length;i++){
            
             if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
             }  
            
           
        }
        while(count<arr.length){
            arr[count]=0;
            count++;
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
        print(Zero(arr));
      
    }
}

