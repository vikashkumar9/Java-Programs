package Sorting.StringAnd2D;

public class removeConDuplicate {

    public static void main(String args[]){
      String name="xxyzxfgrr";
       String result=" ";
      
      int b=name.length()-1;
      for(int i=0;i<b;i++){
         if(name.charAt(i)!=name.charAt(i+1)){
           result=result+name.charAt(i); 
         }
      }
     
      System.out.print(result);
   //  System.out.println(name.charAt(name.length()-1));

    }
    
}
