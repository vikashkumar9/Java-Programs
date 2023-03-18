package Sorting;
import java.util.Scanner;
public class insertion {

    public static int[] takinginput(){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     return arr;
    }
    
    public static int[] insertionsort(int[] arr){
 
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<=i;j++){

                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;       
            }
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
        print(insertionsort(arr));
      
    }
}

