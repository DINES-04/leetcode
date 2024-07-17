import java.util.*;
public class Solution {
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode p=head;
        ListNode q=p.next;
       while (p != null && q != null && q.next != null) {
            if (p == q) {
                return true;
            }
            p= p.next;
            q = q.next.next;
        }

        return false;
    }
     public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static ListNode createnode(int[] arr){
	ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
	return dummy.next;
    }
    public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the no.of element:");
	int len= sc.nextInt();
	int[] arr = new int[len];
	 System.out.print("Enter the elements: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        ListNode head=createnode(arr);
	boolean res= hasCycle(head);
	System.out.println(res);
    }
}