package array;

public class removeduplicate {
    public static int[] removeDuplicates(int[] arr) {
      
        return arr;
     }

    public static void main(String args[]){
        int arr[] = {10, 10, 20, 30, 40, 40, 50};
       // int arr1[]=removeDuplicates(arr);
       
       int j = 0; 
       int lastIndex = arr.length-1; 
       
       for (int i = 0; i < lastIndex; i++) {
          if(arr[i] != arr[i+1]) {
             arr[j++] = arr[i];
          }
       }
       arr[j]=arr[lastIndex];
       j++;
      
       
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
    }}
