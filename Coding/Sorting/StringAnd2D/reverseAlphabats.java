package Sorting.StringAnd2D;

public class reverseAlphabats {
    
    public static void main(String args[]){

        String name="My name is vikash ";
        int n=name.length();
        String result=" ";
        int a=0;
        int i=0;
        for(;i<n;i++){
            if(name.charAt(i)==' '){
                String khali=" ";
                for(int j=a;j<=i-1;j++){
                  khali=name.charAt(j)+khali;
                }
                result+=khali;
                a=i+1;
            }
        }
        String khali=" ";
        for(int j=a;j<=i-1;j++){
          khali=name.charAt(j)+khali;
        }
        result+=khali;

        
        
        System.out.println(result);
    }
}
