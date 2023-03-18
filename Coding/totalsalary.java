import java.util.Scanner;


public class totalsalary{


public static void main(String []args){

Scanner s=new Scanner(System.in);
int basic=s.nextInt();
double hra=0.20 * basic;
double da =0.50*basic;
double pf=0.11*basic;
int allow=s.nextInt();
char grade=s.next().charAt(0);



if(grade =='A'){
allow=1700;
}
else if(grade=='B'){
    allow=1500;
}

if(grade =='C'){
    allow=1300;
}

double d=hra+da+basic+allow-pf;
int total=(int)Math.round(d);
System.out.println(total);
}
}