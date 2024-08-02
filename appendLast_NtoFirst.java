package LinkedList;

import java.util.Scanner;

public class appendLast_NtoFirst {
    
    public static Node<Integer> appendLastN(Node<Integer> head, int n){
		
		Node<Integer> temp = head;
		int l = 1; //to check the length of LL
		while(temp.next!=null) {
			temp = temp.next;
			l++;;
		}
		temp.next = head;
		
		temp = head; //to set temp to head again to check for the node to be pointing to null
		int c = 0;
		Node<Integer> newHead = null; 
		while(temp!=null) {
			if(c==l-n-1) {
				newHead = temp.next;
				temp.next = null;
			}
			temp = temp.next;
			c++;
		}
		return newHead;
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
		int n = sc.nextInt();
		Node<Integer> ans = appendLastN(head, n);
		print(ans);
	}
}
