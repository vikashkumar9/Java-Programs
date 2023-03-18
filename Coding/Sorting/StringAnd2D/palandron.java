package Sorting.StringAnd2D;
import java.util.*;

public class palandron {
    public static boolean check(String str){
       int a= 0;
       int b=str.length()-1;
        while(a<b){
            if(str.charAt(a)!=str.charAt(b)){
                return false;
            }
                a++;
                b--;
        }
        return true;
    }
    public static void main(String arr[]){
        Scanner sc=new Scanner(System.in);
        String str= "foofr";
       
        System.out.println( check(str));
    }
}
