package LinkedList;

import java.util.Scanner;

public class reverseLL {
    
    public static Node<Integer> reverse_way2(Node<Integer> head){
		
		if(head==null || head.next==null) {
			return head;
		}
		Node<Integer> smallOutput = reverse_way2(head.next);
		head.next.next = head; //the connection between the head and head.next node already exist but we need to change the direction of their pointing only
		head.next = null; //the head node would be the last node in the answer
		
		return smallOutput;
	}
	public static void print(Node<Integer> head) {
		
		Node<Integer> temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String args[]) {
		
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
		Node<Integer> ans = reverse_way2(head);
		print(ans);
	}
}
