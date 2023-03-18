public class Mai {
    public static int func(int a) {
        a = a + 10;
       // System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        int a = 10;
         a=func(a);
        System.out.println(a);
    }
}