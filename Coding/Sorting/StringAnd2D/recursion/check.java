package Sorting.StringAnd2D.recursion;



public class check {
    
    
    public static Boolean check(int arr[],int l,int r,int k){
       
        if (r < l)
        return false;
     if (arr[l] == k)
        return true;
     if (arr[r] == k)
        return true;
     return check(arr, l+1, r-1, k);
    }
    public static void main(String args[]){
       
      
      int arr[]={2,4,5,7,8};
      int k=111;
      int l=0;
      int r=arr.length;
      Boolean ans=check(arr, l+1, r-1, k);
       if(ans){
        System.out.println("present h");
       }else{
        System.out.println("nhi h");
       }
       
    }
}
