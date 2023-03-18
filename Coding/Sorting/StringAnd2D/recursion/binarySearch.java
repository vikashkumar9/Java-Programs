package Sorting.StringAnd2D.recursion;

public class binarySearch {
    
    public static Boolean check(int arr[],int s,int e,int k){
       
        if (s > e)
        return false;
        int mid=s+(e-s)/2;
     if (arr[mid] == k)
        return true;
     if (arr[mid] <k){
       return check(arr,mid+1,e,k);
    }
    else{
        return check(arr,s,mid-1,k);
    }
}
    public static void main(String args[]){
       
      
      int arr[]={2,4,5,7,8,9,10,19};
      int k=7;
     int s=0;
     int e=arr.length;
      Boolean ans=check(arr,s,e, k);
       if(ans){
        System.out.println("present h");
       }else{
        System.out.println("nhi h");
       }
       
    }
}

    

