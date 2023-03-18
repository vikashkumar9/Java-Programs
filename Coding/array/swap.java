 
 package array;
 import java.util.Scanner;
public class swap {

    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
       
         int n=sc.nextInt();
         int arr[]=new int[n];
     
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         return arr;
    }
 public static int[] swap(int arr[]){
       int n=arr.length;
       for(int i=0;i<n;i+=2){
        int temp;
        temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
       }
       return arr;
 }
 public static void print(int arr[]){
    int n=arr.length;
    for(int i=0;i< n;i++){
        System.out.print(arr[i] + " ");
    } 
}
    
    public static void main(String args[]){
       
        int  arr[]=takeInput();
        int out[]=swap(arr);
        print(out);

    }
}
