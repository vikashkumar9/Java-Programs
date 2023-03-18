package Sorting.StringAnd2D;

import java.util.*;
public class Solution {

	public static boolean isPermutation(String input1, String input2) {
	  int n1 = input1.length();
		int n2 = input2.length();
		
		int arr[] = new int[255];
		for(int i=0; i<n1;i++) {
			arr[input1.charAt(i)]++;
		}
		for(int i=0; i<n2;i++) {
			arr[input2.charAt(i)]--;
		}
		for(int i=0; i<arr.length;i++) {
			if(arr[i]!=0) {
				return false;
			}
		}
		return true;

	}
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		boolean b = isPermutation(str1,str2);
		System.out.println(b);
	}
}
 
    

