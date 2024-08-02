package LinkedList;

import java.util.Scanner;

public class deleteEveryNnode {
    
    public static Node<Integer> deleteEveryNnodes(Node<Integer> head, int m, int n){
		
		Node<Integer> tempm = head;
		Node<Integer> tempn = head;
		
		int countm = 1;
		while(tempm!=null && tempn!=null) {
			
			if(countm==m) { //it means i have covered m nodes
				tempn = tempm.next;
				int countn = 1;
				
				while(tempn!=null) {
					if(countn==n) { //it means i have covered n nodes
						tempm.next = tempn.next;
						tempm = tempm.next;
						countm = 1;
						break;
					}
                    if(tempn.next==null && countn<n) {
						tempm.next = null;
						return head;
					}
					tempn = tempn.next;
					countn++;
				}
			}
			tempm = tempm.next;
			countm++;
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
		Node<Integer> ans = deleteEveryNnodes(head, 3, 2);
		print(head);
	}
}
