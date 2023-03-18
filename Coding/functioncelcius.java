import java.util.Scanner;

public class functioncelcius {
    public static void functionfaren(int s,int e,int w){
    int celcius=0;
     for(int i=s;i<=e;i=i+w){
    celcius=(i-32)*5/9;
    System.out.println(i+ " "+celcius);
    }
     return ;
    }
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int w=sc.nextInt();
         functionfaren(s,e,w);
    }
    
    
}
