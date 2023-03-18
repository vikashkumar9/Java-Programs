
import java.util.Scanner; 
public class celcius {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int s=sc.nextInt();
        int e= sc.nextInt();
        int w= sc.nextInt();
    
        
while(s<=e){
double c = 5.0/9*(s-32);
    System.out.println(s+"  "+c);
    s=s+w;
}

    }
}
