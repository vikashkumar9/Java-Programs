package array.LinkList;

import java.util.Scanner;
public class MidPoint {
		public static int printMiddel(Node<Integer> head) {
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		try {
			while(fast.next!= null&&fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			
		}
catch(NullPointerException e){
			
		}
		int a = slow.data;
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 Node<Integer> head = null;
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
		 int mid = printMiddel(head);
		 System.out.println(mid);
	}
}