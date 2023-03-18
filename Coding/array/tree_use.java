package array;

public class tree_use {
    public static void main (String args){
     
        tree_node  <Integer> root=new tree_node<Integer>(5);
        tree_node  <Integer> node=new tree_node<Integer>(3); 
        tree_node  <Integer> node1=new tree_node<Integer>(5);
         tree_node  <Integer> node2=new tree_node<Integer>(2);
         tree_node  <Integer> node3=new tree_node<Integer>(6);
         tree_node  <Integer> node4=new tree_node<Integer>(7);
          root.childern.add(node);
    
          root.childern.add(node1); 
          root.childern.add(node2);
          node2.childern.add(node3);
          node3.childern.add(node3);
          
          System.out.println(root);

    }
}
