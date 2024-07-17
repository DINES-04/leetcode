import java.util.*;
class Solution {
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head==null && head.next==null){
            return head;
        }
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode temp=dummy;
        int count=0;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        temp=dummy;
        while(temp.next!=null){
            if(count<k){
                break;
            }
            int nodes= k-1;
            ListNode tempnext=temp.next;
            ListNode first= temp.next;
            ListNode second= first.next;

            while(nodes-- > 0){
                ListNode next= second.next;
                second.next=first;
                first=second;
                second=next;
            }
            count-=k;
            temp.next=first;
            tempnext.next=second;
            temp=tempnext;
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
	System.out.print("Enter the k value:");
	int k= sc.nextInt();
	ListNode res= reverseKGroup(head,k);
	printList(res);
    }
}