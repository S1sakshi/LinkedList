package LinkedList;

import java.util.Scanner;

public class merge2SortedLL {
    
    public static Node<Integer> merge2LL_Recursively(Node<Integer> head1, Node<Integer> head2){
		
		if(head1==null) {
			return head2;
		}
		if(head2==null) {
			return head1;
		}
		if(head1.data<=head2.data) {
			
			Node<Integer> smallOutput1 = new Node<>(head1.data);
			Node<Integer> smallOutput2 = merge2LL_Recursively(head1.next, head2);
			smallOutput1.next = smallOutput2;
			return smallOutput1;
		}
		else {
			Node<Integer> smallOutput1 = new Node<>(head2.data);
			Node<Integer> smallOutput2 = merge2LL_Recursively(head1, head2.next);
			smallOutput1.next = smallOutput2;
			return smallOutput1;
		}
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
		System.out.println("Enter 1st LL:");
		int x1 = sc.nextInt();
		
		Node<Integer> head1 = null;
		Node<Integer> tail1 = null;
		
		while(x1!=-1) {
			Node<Integer> currNode1 = new Node<>(x1);
			
			if(head1==null) {
				head1 = currNode1;
				tail1 = currNode1;
			}
			else {
				tail1.next = currNode1;
				tail1 = currNode1;
			}
			x1 = sc.nextInt();
		} 
		System.out.println("Enter 2nd LL:");
        int x2 = sc.nextInt();
		
		Node<Integer> head2 = null;
		Node<Integer> tail2 = null;
		
		while(x2!=-1) {
			Node<Integer> currNode2 = new Node<>(x2);
			
			if(head2==null) {
				head2 = currNode2;
				tail2 = currNode2;
			}
			else {
				tail2.next = currNode2;
				tail2 = currNode2;
			}
			x2 = sc.nextInt();
		}
//		Node<Integer> ans = merge2LL(head1, head2);
		Node<Integer> ans = merge2LL_Recursively(head1, head2);
		print(ans);
	} 
}
