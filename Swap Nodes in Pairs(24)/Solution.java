 import java.util.*;
class Solution {
     static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode p=dummy;
        while(p.next !=null && p.next.next !=null){
            ListNode q=p.next;
            ListNode r=p.next.next;
            // swap
            q.next=r.next;
            r.next=q;
            p.next=r;
            // initalize
            p=q;
        }
        return dummy.next;
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
	ListNode res= swapPairs(head);
	printList(res);
    }

}