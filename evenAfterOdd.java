package LinkedList;

import java.util.Scanner;

public class evenAfterOdd {
    
    public static Node<Integer> evenAfterOdd(Node<Integer> head){
		
		Node<Integer> temp = head;
		
		Node<Integer> oddHead = null;
		Node<Integer> oddTail = null;
		Node<Integer> evenHead = null;
		Node<Integer> evenTail = null;
		
		while(temp!=null) {
			
			if(temp.data%2==0) {
				if(evenHead==null) {
					evenHead = temp;
					evenTail = temp;
				}
				else {
					evenTail.next = temp;
					evenTail = temp;
				}
			}
			else {
				if(oddHead==null) {
					oddHead = temp;
					oddTail = temp;
				}
				else {
					oddTail.next = temp;
					oddTail = temp;
				}
			}
			temp = temp.next;
		}
		evenTail.next = null;
		oddTail.next = evenHead;
		return oddHead;
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
		Node<Integer> ans = evenAfterOdd(head);
		print(ans);
	}
}
