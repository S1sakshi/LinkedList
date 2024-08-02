package LinkedList;

import java.util.Scanner;

public class print_ith_NodeData {
    
    public static void print_ith(Node<Integer> head, int i){
		
		Node<Integer> temp = head;
		int l = 0;
		
		while(temp!=null) {
			if(l==i) {
				System.out.println(temp.data);
				break;
			}
			l++;
			temp = temp.next;
		}
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		Node<Integer> head = null;
		Node<Integer> curr = head;
		
		while(x!=-1) {
			if(head==null) {
				head = new Node<>(x);
				curr = head;
				x = sc.nextInt();
			}
			else {
				Node<Integer> temp = new Node<>(x);
				curr.next = temp;
				curr = curr.next;
				x = sc.nextInt();
			}
		}
		int i = sc.nextInt();
		
		print_ith(head, i);
	}
}
