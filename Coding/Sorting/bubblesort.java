package Sorting;

import java.util.Scanner;
public class bubblesort {
    
    public static int[] takinginput(){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     return arr;
    }
    
    public static int bubblesort(int[] arr){
       int secondlargest;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
               
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;       
            }
             }
        }
        secondlargest=arr.length-2;
            return arr[secondlargest];
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
        int s=bubblesort(arr);
        System.out.println(s);
      
    }
}

