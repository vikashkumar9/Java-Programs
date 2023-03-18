package Sorting;

import java.util.Scanner;
public class secondlargest {

    public static int[] takinginput(){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     return arr;
    }
    
    public static int secondlargest(int[] arr){
       int second;
       int largest=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            second=largest;
            largest=arr[i];
        }
        
       }
       return largest;
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
       // print(largest());
     int lt=  secondlargest(arr);
     System.out.println(lt);
     secondlargest(arr);
      
    }
}

