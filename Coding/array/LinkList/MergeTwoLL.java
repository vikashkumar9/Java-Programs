package array.LinkList;

import java.util.Scanner;

public class MergeTwoLL {
    public static Node<Integer> takeInput()
	{
		Node<Integer> head = null;
		Scanner sc = new Scanner(System.in);
		
		 Node<Integer> tail = null;
		 int data = sc.nextInt();
		 while(data != -1) {
			 Node<Integer> newnode = new Node<Integer>(data);
			 if(head == null) {
				 head = newnode ;
				 tail = newnode ;
			 }
			 else {
				 tail.next = newnode;
				 tail = newnode;
			 }
			 data = sc.nextInt();
			 }
		
		return head;
	}
    
    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static Node<Integer> merge(Node<Integer> head1,Node<Integer> head2){

             if(head1==null){
                return head2;
             }
             if(head2==null){
                return head1;
             }
             Node<Integer> t1=head1,t2=head2,head3=null,tail=null;

             if(head1.data<=head2.data){
                head3=t1;
                tail=t1;
                t1=t1.next;
             }
             else{
                head3=t2;
                tail=t2;
                t2=t2.next;
             }

             while(t1!=null&&t2!=null){
                if(head1.data<=head2.data){
                    tail.next=t1;
                    tail=t1;
                    t1=t1.next;
                 }
                 else{
                    tail.next=t2;
                    tail=t2;
                    t2=t2.next;
                 }  
             }
             if(t1 != null){
                tail.next=t1;
             }
             else{
                tail.next=t2;
             }
             return head3;

    }

	public static void main(String[] args) {
        Node<Integer> head1=takeInput();
        Node<Integer> head2=takeInput();
        Node<Integer> head3=merge(head1, head2);
        print(head3);

        
		
	}
}