import java.util.*; 
class Solution {
     static class ListNode {
     	int val;
	ListNode next;
     	ListNode() {}
     	ListNode(int val) { this.val = val; }
    	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
     public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode p = dummy;
        ListNode q = dummy;

        // Move q to the node n steps ahead of p
        for (int i = 0; i <= n; i++) {
            q = q.next;
        }

        // Move both p and q until q reaches the end
        while (q != null) {
            p = p.next;
            q = q.next;
        }

        // Now p is at the node just before the one to be removed
        p.next = p.next.next;

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
    public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the no.of element:");
	int len= sc.nextInt();
	int[] arr = new int[len];
	 System.out.print("Enter the elements: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
	ListNode head = dummy.next;
	head = removeNthFromEnd(head, n);

        System.out.print("Modified list: ");
        printList(head);
    }
}
