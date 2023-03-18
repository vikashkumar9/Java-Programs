package array;
import java.util.Scanner;
public class swaparr {

    public static int[] takinginput(){
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();
        int arr[]=new int [size];
        for(int i=0;i<size;i++){
  arr[i]=sc.nextInt();
        }
     return arr;
    }
    public static int[] arrswap(int[] arr){
      int  size=arr.length;
    for(int i=0;i<size;i=i+2){
int temp= arr[i];
arr[i]=arr[i+1];
arr[i+1]=temp;

    }
    return arr ;
}  
    public static void main(String args[]){
        
       int arr[]= takinginput();
       int out[] = arrswap(arr);
       for(int i=0;i<arr.length;i++)
       System.out.println(out[i]);
    }

}