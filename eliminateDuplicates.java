package LinkedList;

import java.util.Scanner;

public class eliminateDuplicates {
    
    public static Node<Integer> eliminateDup(Node<Integer> head){
		
		Node<Integer> temp = head;
		
		Node<Integer> first = head;
		Node<Integer> second = head;
		
		while(second!=null) {
			if(first.data.equals(second.data)) {
				second = second.next;
			}
			else {
				first.next = second;
				first = first.next;
				second = second.next;
			}
		}
		if(first.next!=null && first.data.equals(first.next.data)) {
			first.next = null;
		}
		return head;
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
		Node<Integer> ans = eliminateDup(head);
		print(ans);
	}

}
