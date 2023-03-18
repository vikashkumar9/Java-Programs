package Sorting.StringAnd2D.recursion;

public class removex {

    public static String remove(String str){
        if(str.length()==0){
            return str;
        }
        String ans="";
         if(str.charAt(0)!='x'){
            ans=ans+str.charAt(0);
         }
         return ans+remove(str.substring(1));

    }
    public static void main(String args[]){

        String str="xbsjikkxn";
        System.out.println(remove(str));

    }
}
