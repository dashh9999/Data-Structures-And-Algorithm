import java.util.*;


public class Palindrome {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist= new LinkedList(); 
        int a1=sc.nextInt();
        Node head= new Node(a1);
        llist.addToTheLast(head);
        for (int i = 1; i < n; i++) 
        {
            int a = sc.nextInt(); 
            llist.addToTheLast(new Node(a));
        }
            
        Solution A = new Solution();
        A.checkLinkedListPalindrome(llist.head);
        
    }
}

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    
class LinkedList
{
    Node head;  
    Node tail;
    public void addToTheLast(Node node) 
    {
      if (head == null) 
      {
       head = node;
       tail = node;
      } 
      else 
      {
       tail.next = node;
       tail = node;
      }
    }
      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
// 	static Node reverse(Node head){
//      Node curr = head, prev = null, right;
//         while(curr != null){
//             // we want to secure the linked list that is coming after the current node
//             right = curr.next;
            
//             curr.next = prev; // actual link reversal
            
//             // Just moving the variables for next iteration
//             prev = curr;
//             curr = right;
//         }
//         return prev;
    
// }
}


class Solution
{
	static Node reverse(Node head){
     Node curr = head, prev = null, right;
        while(curr != null){
            // we want to secure the linked list that is coming after the current node
            right = curr.next;
            
            curr.next = prev; // actual link reversal
            
            // Just moving the variables for next iteration
            prev = curr;
            curr = right;
        }
        return prev;
    
}
    static void checkLinkedListPalindrome(Node head)
    {
        //Your code here
			Node temp=head;
		Node rev = reverse(head);
		boolean flag=true;
		while(temp!=null)
		{
			if(temp.data!=rev.data){
				flag=false;
			}else{
				flag =true;
			}
			temp=temp.next;
			rev=rev.next;
		}
		if (flag==true){
			System.out.print("YES");
		}else {
			System.out.print("NO");
		}
    
    }
    
}
		