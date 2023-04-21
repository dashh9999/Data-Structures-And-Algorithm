
import java.util.*;
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class Main {
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int a1 = sc.nextInt();
        Node head = new Node(a1);
        addToTheLast(head);

        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            addToTheLast(new Node(a));
        }

        Solution abc=new Solution();
        Node node = abc.quickSort(head);

        printList(node);
        System.out.println();
    
        sc.close();
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
}

class Solution {
    
  
        //Your code here
		public static Node[] partition(Node head)
	{
		Node pivot = head;
		Node dl = new Node(-1);
		Node tl=dl;
		Node dr = new Node(-1);
		Node tr = dr;
		Node t = head;
		while(t!=null)
		{
			if(t!=pivot)
			{
				if(t.data<=pivot.data){
					tl.next=t;
					tl=t;
					
				}
				else{
					tr.next=t;
					tr=t;
				}	
			}
			t=t.next;
		}
		tr.next=null;
		tl.next=null;
		pivot.next=null;
		Node []ans = {dl.next,pivot,dr.next};
		return ans;
	}
    
    public static Node quickSort(Node node)
    {
        //Your code here
		if(node ==null || node.next==null){
			return node;
		}

		Node []arr = partition(node);
		// arr[0] -> hL
		// arr[1] -> pivot
		// arr[2] -> hR
		Node headL = arr[0];
		Node pivot = arr[1];
		Node headR = arr[2];
		headL = quickSort(headL);
		headR = quickSort(headR);
		pivot.next=headR;

		if(headL==null){
			return pivot;
		}

		Node temp = headL;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=pivot;
		return headL;
    }

        
    }


