package Sorting.StringAnd2D.recursion;


public class sum {
    public static int sum(int arr[],int size){
     
        if(size==1){
            return arr[0];
        }
        
      
      return sum(arr, size-1 ) + arr[size-1];
       
    }
    public static void main(String args[]){
       
        int arr[]={2,4,5,7,8};
       int  size=5;
        int a=sum(arr,size);
        System.out.println(a);
    }
}
