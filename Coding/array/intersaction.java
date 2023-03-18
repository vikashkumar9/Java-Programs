
package array;
import java.util.Scanner;
  public class intersaction  {
   
    public static int[] takinginput(){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     return arr;
    }
    
    public static void inter(int[] arr1, int[] arr2){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                   System.out.println(arr1[i]);
                   arr2[j]=-1002;
                   break;
                }

            }
        }
    }
     

  
    public static void print(int arr[]){
        int n = arr.length;
        for(int i=0;i< n;i++){
            System.out.print(arr[i] + " ");
        } 
    }
    
    public static void main(String args[]) {
        int arr1[] =takinginput();
        int arr2[] =takinginput();
        // System.out.println(findunique(arr)); 
         //System.out.println(inter(arr)); 
         inter(arr1, arr2);
    }
}

