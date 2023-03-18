package array.LinkList;
import java.util.Scanner;

public class UseNode {
// public static int length(Node<Integer> head){
//     int l=0;
//     while(head!=null){
//         head=head.next;
//         l=l+1;

//     }
//     return l;
// }
public static void position(Node<Integer> head,int i){
     int position=0;
    while(head!=null && position<i){
        head=head.next;
        position=position+1;

    }
    
        System.out.println(head.data);
    
}


    public static Node<Integer> takeInput()
	{
		Node<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
				
		while(data != -1){
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null){
				head = newNode;
				tail = newNode;
			}else{
				// Node<Integer> temp = head;
				// while(temp.next != null){
				// 	temp = temp.next;
				// }
				// temp.next = newNode;
				tail.next = newNode;
				tail = newNode; // tail = tail.next
			}
			data = s.nextInt();
		}
		return head;
	}

    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static Node<Integer> insert(Node<Integer> head,int data,int position){
        
        int i=0;
        Node<Integer> newNode =new Node<Integer>(data);
        if(position==0){
            newNode.next=head;
            return newNode;
        }
        Node<Integer> temp=head;
        while(i<position-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
    }
    public static Node<Integer> deleteIthNode(Node<Integer> head, int i){
		int a = 0;
		if(i == 0) {
			head = head.next;
			return head;
		}
		Node<Integer> temp = head;
      try{
       while(a < i-1) {
			temp = temp.next;
			a++;
		} 
        temp.next = temp.next.next;
      }
		catch(NullPointerException e){	
		}
		return head;
    }
	
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // int i=sc.nextInt();
        // Node<Integer> node1 = new Node<Integer>(10);
        // Node<Integer> node2 = new Node<Integer>(12);
        // node1.next=node2;
        // Node<Integer> node3 = new Node<Integer>(14);
        // node2.next=node3;
        // Node<Integer> head=node1;
        // while(head!=null){
        //     System.out.print(head.data+" ");
        //     head=head.next;
        // }
      Node<Integer> head=takeInput();
    // head= insert(head, 80, 0);
      head=deleteIthNode(head, 0);
     print(head);
      
    //   System.out.println();
    //   System.out.println(a);
   // position(head,3);

    }
    
}
