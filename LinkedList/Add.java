
import java.util.*;
import java.io.*;
public class Add {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        for(int i = 0; i < n; i++){
            a.add(input.nextInt());
        }
        for(int i = 0; i < m; i++){
            b.add(input.nextInt());
        }
        LinkedList ans = new LinkedList();
        Solution A = new Solution();
        ans.head = A.addTwoLinkedLists(a.head, b.head);
        ans.printList();

    }
}


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
    public static Node addTwoLinkedLists(Node head1, Node head2)
    {
        //Write your code here
		
        Node l1 = reverse(head1);
         Node l2 = reverse(head2);

         Node dummy = new Node(0);
        Node temp = dummy;
        int sum = 0, carry = 0;
        while(l1 != null || l2 != null){
            sum = 0;
            if(l1 != null){
                sum += l1.data;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.data;
                l2 = l2.next;
            }
            sum += carry;
            // I should
			carry = sum / 10;
            Node n = new Node(sum % 10);

            // Add it next to temp Node
            temp.next = n;
            temp = temp.next;
        }
        if(carry > 0) {
            Node n = new Node(carry);
            temp.next = n;
        }
        return reverse(dummy.next);
    }
    
}
