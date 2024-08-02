package LinkedList;

import java.util.Scanner;

public class insertNodeInLL {
    
    public static Node<Integer> insertNode_Recursively(Node<Integer> head, int pos, int data){
		
		if(head==null && pos>0) {
			return head;
		}
		if(pos==0) {
			Node<Integer> newNode = new Node<>(data);
			newNode.next = head;
			return newNode;
		}
		Node<Integer> smallOutput = insertNode_Recursively(head.next, pos-1, data);
		head.next = smallOutput;
		return head;
		
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
		Node<Integer> ans = insertNode_Recursively(head, 4, 50);
		print(ans);
	}
}
