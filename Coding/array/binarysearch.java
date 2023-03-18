package array;
import java.util .Scanner;
public class binarysearch {
    public static void main (String []args){
Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
arr[i]=sc.nextInt();

    }
    int x=sc.nextInt();
    
    for(int i=0;i<n;i++){
        int mid=(n+i)/2;
        if(arr[mid]==x){
            
    System.out.println(mid);

        }
        else if(arr[mid]>x){
System.out.println(mid+1);
        }
        else{
            System.out.println(mid-1);
        }
        
    }

}
}
