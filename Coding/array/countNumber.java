package array;

import java.util.Scanner;

public class countNumber {
    public static void main(String str[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]={1,2,4,2,3,5,5,3,2};
        int count=0;
           for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
             count=count+1;
            }
           }
           System.out.println(count);


    }
    
}
