import java.util.*;

class Solution {
	public static Node merge(Node first,Node second){
		Node dummy=new Node(-1);
		Node t1=first;
		Node dummy1=new Node(-1);
		Node t2=second;
		Node temp=dummy;
		while(t1!=null && t2!=null)
			{
				if(t1.data<t2.data)
				{
					temp=t1;
					temp=temp.next;
					t1=t1.next;
				}
				else
				{
					temp=t2;
					temp=temp.next;
					t2=t2.next;
				}
			}
		
		if(t1!=null)
		{
			temp.next=t1;
		}
       else
		{
			temp.next=t2;
		}
		return dummy.next;
			}
	public static Node getmid(Node head){
		
		Node slow=head;
		Node fast=head;
		while(fast.next!=null && fast.next.next!=null)
			{
				fast=fast.next.next;
				slow=slow.next;
			}
		return slow;
	}
    public static Node mergesort(Node head){
		if(head==null || head.next==null){
			return head;
		}

        //Write your code here
		Node mid=getmid(head);
		Node headB=mid.next;
		mid.next=null;
		//Node temp=head;
		head=mergesort(head);
		headB=mergesort(headB);
		
		Node ans=merge(head,headB);
		return ans;

    }
}


class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}
public class MergeSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        LinkedList a = new LinkedList();
        for(int i = 0; i < n; i++){
            a.add(input.nextInt());
        }
        Solution Obj = new Solution();
        a.head = Obj.mergesort(a.head);
        Node h = a.head;
        while(h != null){
            System.out.print(h.data + " ");
            h = h.next;
        }
    }
}
