package LinkedList;

import java.util.Scanner;

public class findNodeInLL {
    
    public static int findNode_Recursively(Node<Integer> head, int n) {
		
		if(head==null) {
			return -1;
		}
		if(head.data.equals(n)) {
			return count1;
		}
		count1++;
		int gotNode = findNode_Recursively(head.next, n);
		return gotNode;
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
		int num = findNode_Recursively(head, 30);
		System.out.println(num);
	}
}
