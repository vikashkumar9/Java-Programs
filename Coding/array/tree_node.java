
package array;
import java.util.ArrayList;
class tree_node <T>{
public T data;
public Arraylist<tree_node<T>>childern;
public Object addnode;
public Object children;
    public tree_node(T data){
        this.data=data;
      childern=new Arraylist<>();
    }
}