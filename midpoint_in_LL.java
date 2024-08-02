package LinkedList;

import java.util.*;

public class midpoint_in_LL {
    
    public static Node<Integer> midpoint(Node<Integer> head){
		
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		
		while(fast.next!=null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node<Integer> sl = slow;
		sl.next = null;
		return sl;
	} 
	public static void print(Node<Integer> head) {

		Node<Integer> temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
		while(x!=-1) {
			Node<Integer> currNode = new Node<>(x);
			
			if(head==null) {
				head = currNode;
				tail = currNode;
			}
			else {
				tail.next = currNode;
				tail = currNode;
			}
			x = sc.nextInt();
		}
		Node<Integer> mid = midpoint(head);
		print(mid);
	}
}
