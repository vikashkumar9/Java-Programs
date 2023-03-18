import java.util.Scanner;
public class DecToBin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int arr[]=new int[100];
        int i;
        int val=0;
        for(i=n;i>0;i=i/2){
            
            arr[val]=i%2;
                val++;
        }
        for(int j=val-1;j>=0;j--){
           System.out.print(arr[j]);
           
        }
        
    }
    
}

