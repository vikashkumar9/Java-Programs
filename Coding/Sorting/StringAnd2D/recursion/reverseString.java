package Sorting.StringAnd2D.recursion;

public class reverseString {
    // public static Boolean reverse(String str,int i,int j){
    //   if(j<i)
    //        return true;

    //   if(str.charAt(i) ==str.charAt(j)){
        
    //     return reverse(str,i+1, j-1);
    //   }
    //   else{
    //     return false;
    //   }
     
    // }
    public static void reverse(String str,int i,int j){
        if(j<i)
             return ;

          char temp=str.charAt(i);
        str.charAt(i) ==str.charAt(j);
        str.charAt(j)=temp;
          
          return reverse(str,i+1, j-1);
        }
      
    public static void main(String args[]){
        String str="abcbd";
        
     System.out.println(reverse(str,0,str.length()-1) ); 
    }
    
}
