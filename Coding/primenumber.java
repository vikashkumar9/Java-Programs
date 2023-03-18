import java .util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=2;i<=n;i++){
           int  prime=1;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    prime=0;
                }
                }
                if(prime==1){
                    System.out.println(i);
                }
            }    
    }
    }


