package array;
import java.util.Scanner;
  public class pairsum {
   
    public static int[] takinginput(){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     return arr;
    }
    public static void pair(int[] arr){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sum");
        int number=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==number){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
    public static void triplePair(int[] arr){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sum");
        int number=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                if(arr[i]+arr[j]+arr[k]==number){
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                }
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
      
        int arr[] =takinginput();
        // System.out.println(findunique(arr)); 
         //System.out.println(pair(arr)); 
         pair(arr);
         triplePair(arr);
    }
}

