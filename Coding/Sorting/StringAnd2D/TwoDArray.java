package Sorting.StringAnd2D;
import java.util.Scanner;

public class TwoDArray {
    public static int[][] input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int columns=sc.nextInt();

        int arr1[][]=new int[rows][columns];
    for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
            System.out.println("Enter the "+i+"row:"+"Enter the "+j+"row:");

            arr1[i][j]=sc.nextInt();
            
        }
       
    }
    return arr1;
   
}
    
    public static void print(int arr[][]){
        int sum=0;
        int largest=Integer.MIN_VALUE;
        int rows=arr.length;
        int columns=arr[0].length;
        System.out.println("Result");
        for(int i=0;i<rows;i++){
            sum=0;
            for(int j=0;j<columns;j++){
                sum=sum+arr[i][j];
                if(sum>largest){
                    largest=sum;
                }
                
            }
        }
        System.out.println(largest);
        
    }
    public static void main(String args[]){
    int arr[][]=input();
     print(arr);
    

    }
}
