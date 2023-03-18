package Sorting;
import java.util.Scanner;
 
public class binarySearch {
    


   
    public static int[] takinginput(){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     return arr;
    }
    
    // public static void binnarySearch(int[] arr){
    //     int i=0;
    //     int k=arr.length-1;
    //     int middle=(i+k)/2;
    //     int number=6;
        
    //     while(i<=k){
    //          middle=(i+k)/2;
    //         if(number==arr[middle]){
       
    //             System.out.print(middle);
    //             break;
    //             }
    //             else if(number<arr[middle]){
    //                 k=middle-1;
    //             }
    //             else{
    //                 i=middle+1;
    //             }
    //         }

    // }

    public static int binarySearch(int[] arr) {
    	//Your code goes here
        int i=0;
        int k=arr.length-1;
        int middle=(i+k)/2;
        Scanner dc=new Scanner(System.in);
        System.out.println("Enter the numbrt--");
         int number =dc.nextInt();
         System.out.println("Index of  "+number+ " is--");
        while(i<=k){
             middle=(i+k)/2;
                if(number<arr[middle]){
                    k=middle-1;
                }
                else if(arr[middle]<number) {
                    i=middle+1;
                }
                else{
                    return middle;
                }
            }
    
    return -1;

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
      System.out.println( binarySearch(arr));
      
    }
}

