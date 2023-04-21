import java.util.*;
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Main{
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = sc.nextInt();
        Node first = new Node(val);
        Node tail = first;
        for(int i=0; i<n-1; i++)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        int m = sc.nextInt();
        val = sc.nextInt();
        Node second = new Node(val);
        tail = second;
        for(int i=0; i<m-1; i++)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        Solution g = new Solution();
        Node res = g.subtract(first, second);
        printList(res);
    }
}

class Solution{ 
	public static Node reverse(Node head)
	{
		Node curr = head;
		Node prev = null;
		while(curr!=null){
			Node temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}

	public static int size(Node curr){
		Node temp = curr;
		int count =0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}

	public static int greater(Node t1,Node t2){
		// return 1 if t1 is having a bigger number
		// returns -1 if t2 is having bigger number
		// returns 0 if number is same
		int s1 = size(t1);
		int s2 = size(t2);
		if(s1>s2){
			return 1;
		}
		else if(s1<s2){
			return -1;
		}
		else{
			// lengths of both ll is same
			while(t1!=null && t2!=null)
			{
				if(t1.data>t2.data){
					return 1;
				}
				else if(t1.data<t2.data){
					return -1;
				}
				t1=t1.next;
				t2=t2.next;
			}
			return 0;
		}
	}


	
    static Node subtract(Node l1, Node l2)
    {
		int status = greater(l1,l2);
		if(status==0){
			return new Node(0);
		}
		if(status==-1){
			Node temp=l1;
			l1=l2;
			l2=temp;
		}
		// l1 is greater than l2
		l1=reverse(l1);
		l2=reverse(l2);
		int borrow=0;
		Node d = new Node(-1);
		Node t =d;
		while(l1!=null || l2!=null){
			int val=l1.data;
			l1=l1.next;
			val-=borrow;
			if(l2!=null){
				val-=l2.data;
				l2=l2.next;
			}
			if(val<0){
				val+=10;
				borrow=1;
			}
			else{
				borrow=0;
			}
			t.next= new Node(val);
			t=t.next;
		}
		Node ans = reverse(d.next);
		Node temp=ans;
		while(temp.data==0){
			temp=temp.next;
		}
		return temp;

	
}
				}
