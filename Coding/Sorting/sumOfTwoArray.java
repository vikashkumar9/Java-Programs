package Sorting;


import java.util.Scanner;
public class sumOfTwoArray {

    public static int[] takinginput(){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     return arr;
    }
  
    public static int[] sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        int count =Math.max(arr1.length, arr2.length);
        // Your code goes here
        while (i >= 0 && j >= 0) {
            int val1 = arr1[i];
            int val2 = arr2[j];
            int sum = val1 + val2 + carry;
            output[count] = sum % 10;
            carry = sum / 10;
           
            count--;
            i--;
            j--;
        }

        while (i >= 0) {
            int val1 = arr1[i];

            int sum = val1 + carry;
           output[count] =sum % 10;
            carry = sum / 10;
            
            count--;
            i--;
        }
        while (j >= 0) {
            int val2 = arr1[j];
            int sum = val2 + carry;
            output[count] =sum % 10;
            carry = sum / 10;
            count--;
            j--;
        }
        output[0]=carry;
        return output;
    }

    
    
    public static void print(int arr[]){
        int n = arr.length;
        for(int i=0;i<= n;i++){
            System.out.print(arr[i] + " ");
        } 
    }
    
    public static void main(String args[]) {
        
         
        int arr1[] =takinginput();
        int arr2[] =takinginput();
        //sumOfTwoArrays(arr1, arr2, arr);
      // sumOfTwoArrays(arr1, arr2, arr2);
      print(sumOfTwoArrays(arr1, arr2, arr2));
      //print(out);

      
    }
}


    
    