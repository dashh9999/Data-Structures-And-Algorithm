import java.io.*;
import java.util.*;
 
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
    static void unfold(Node head)
    {
     // Your code here
		Node t0=new Node(-1);
		Node l0=t0;
		Node t1=new Node(-1);
		Node l1=t1;
		Node t2=new Node(-1);
		Node l2=t2;
		Node t=head;
		while(t!=null)
			{
				if(t.data==0)
				{
					l0.next=t;
					t=t.next;
					l0=l0.next;
				}
				else if(t.data==1)
				{
					l1.next=t;
					t=t.next;
					l1=l1.next;
				}
				else
				{
					l2.next=t;
					t=t.next;
					l2=l2.next;
				}
			}
		l0.next=t1.next;
		l1.next=t2.next;
		l2.next=null;
		Node s= t0.next;
		while(s!=null)
			{
				System.out.print(s.data+" ");
				s=s.next;
			}
		
    }
}
public class Segegrate0s1sAnd2s {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        Solution Ob = new Solution();
        Ob.unfold(l1.head);
    }
}
