package Sorting;
import java.util.Scanner;

public class selectionSort {
    
    public static int[] takinginput(){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     return arr;
    }
    
    public static int[] selectionsort(int[] arr){
 
        for(int i=0;i<arr.length-1;i++){
           int min=arr[i];
           for(int j=i+1;j<arr.length;j++){
           if(arr[j]<min){
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
           }
           min=arr[i];
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
        print(selectionsort(arr));
      
    }
}

