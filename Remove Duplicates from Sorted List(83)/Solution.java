import java.util.*;
class Solution {
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode news = new ListNode(0);
        news.next = head;
         if (head == null || head.next == null) 
            return head;
        ListNode i=head;
        while(i!=null && i.next!=null){
        if(i.val==i.next.val){
            i.next=i.next.next;
        }else{
            i=i.next;
        }
        }
        return news.next;
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
	ListNode res= deleteDuplicates(head);
	printList(res);
    }
}