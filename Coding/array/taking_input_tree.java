package array;
import java.util.Scanner;
public class taking_input_tree {
   
    public static tree_node<Integer> takinginput(){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        tree_node <Integer> root=new tree_node<Integer>(n);
int child=sc.nextInt();
for(int i=0;i<child;i++){
tree_node<Integer> childe=takinginput();
 root.children.add(child);
}
return root;
    }
public static void main (String args[]){

}
    

}
