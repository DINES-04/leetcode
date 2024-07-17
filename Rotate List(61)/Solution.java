import java.util.*;
class Solution {
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        } 
        ListNode newtail=head;
        k=k%len;
        if(k==0){
            return head;
        }
        for(int i=0;i<len-k-1;i++){
            newtail=newtail.next;
        }
        ListNode newhead=newtail.next;
        newtail.next=null;
        tail.next=head;

        return newhead;
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
	System.out.print("Enter the k value:");
	int k= sc.nextInt();
	ListNode res= rotateRight(head,k);
	printList(res);
    }
}