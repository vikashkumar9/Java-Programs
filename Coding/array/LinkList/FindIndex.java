package array.LinkList;
import java.util.*;
public class FindIndex {
    public static Node<Integer> takeInput()
	{
		Node<Integer> head = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
				
		while(data != -1){
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null){
				head = newNode;
				
			}else{
				Node<Integer> temp = head;
				while(temp.next != null){
					temp = temp.next;
				}
				temp.next = newNode;
							}
			data = s.nextInt();
		}
		return head;
	}
    public static Node<Integer> removeDuplicates(Node<Integer> head) {
		Node<Integer> temp1 = head;
		Node<Integer> temp2 = null;
		if(head == null) {
			return null;
		}
		while(temp1.next != null) {
			if(temp1.data.equals(temp1.next.data)) {
				temp2 = temp1.next.next;
				temp1.next = null;
				temp1.next = temp2;
			}
			else {
				temp1 = temp1.next;
			}
		}
		return head;
	}

    public static void printReverseRecursive(Node<Integer> root) {
		Node<Integer> prev = null; 
		Node<Integer> current = root; 
		Node<Integer> next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        root = prev; 
    	while(root != null) {
			System.out.print(root.data+ " ");
			root = root.next;
		}
	}


    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void find(Node<Integer> head,int n){
     int a=0;
     while(head.data!=n){
        head=head.next;
        a++;
     }
     System.out.println("     "+a);

    }
    public static void main(String args[]){
        Node<Integer> head=takeInput();
        print(head);
        find(head, 5);
    }

}
