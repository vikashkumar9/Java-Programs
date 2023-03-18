package Sorting.StringAnd2D.recursion;

public class replaceCharecter {

    public static String replace(String str,char c1,char c2){
        if(str.length()==0){
            return str;
        }
        String ans="";

        if(str.charAt(0)==c1){
            ans=ans+c2;
        }
        else{
            ans=ans+str.charAt(0);
        }
        return ans + replace(str.substring(1), c1, c2);
    }
    public static void main(String args[]){
        String str="abdmxam";
        System.out.println(replace(str, 'a', 'x'));
    }
    
}
