package LinkedList;

import java.util.Scanner;

public class checkPalindrome {
    
    public static Node<Integer> left = null;
	public static boolean checkPalindrome_Easy(Node<Integer> head) {
		
		if(head==null) {
			return true;
		}
		if(left==null) {
			left = head;
		}
		boolean smallOutput = checkPalindrome_Easy(head.next);
		Node<Integer> right = head;
		
		if(!left.data.equals(right.data)) {
			return false;
		}
		left = left.next;
		
		return smallOutput;
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
		boolean ans = checkPalindrome_Easy(head);
		System.out.println(ans);
	}
}
