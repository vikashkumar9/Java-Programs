package array;
import java.util.Scanner; 
public class arr3 {
    public static void arrange(int[] arr, int n) {
    	
        int s=0;
       int e=n-1;
       int count=1;
       while(s<=e){
             if(count%2==1){
                arr[s]=count;
                s++;
                count++;
             } 
             else{
                arr[e]=count;
                e--;
                count++;
             }
       } 
    }
    public static void print(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            System.out.println(arr[i]);
        } 
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[] = new int[n];
        
       // FUNCTIONS CALL
       arrange(arr, n);
       print(arr);
 
    }
    
}
