package Sorting.StringAnd2D.recursion;

public class findIndex {
    // public static int findFirstIndex(int arr[],int n,int k){
    //    if(n==arr.length){
    //     return -1;
    //    }
    //    if(arr[n]==k){
    //     return n;
    //    }
    //     int a=findFirstIndex(arr, n+1, k);
    //     return a;
    // }
    public static int findFirstIndex(int arr[],int n,int k){
        if(n==arr[0]){
         return -1;
        }
        if(arr[n]==k){
         return n;
        }else{
            int a=findFirstIndex(arr, n-1, k);
            return a;
        }
        
     }
    public static void main(String args[]){
        int arr[]={1,2,3,4,2,1};
       // System.out.println(arr.length);
        System.out.println( findFirstIndex(arr, arr.length-1, 4));
    }
}
