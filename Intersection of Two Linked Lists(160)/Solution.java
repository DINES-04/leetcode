/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

class ListNode {
    int val;
    ListNode next;
    
    // Constructor
    ListNode(int x) {
        val = x;
        next = null;
    }
}


public class Solution {
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        ListNode p = headA;
        ListNode q = headB;
        
        while (p != q) {
            p = p.next;
            q = q.next;
            if (p == q) {
                return p;
            }
            if (p == null) {
                p = headB;
            }
            if (q == null) {
                q = headA;
            }
        }
        return p;
    }
    public static void main(String[] args) {
 
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        ListNode headB = new ListNode(6);
        headB.next = new ListNode(4);
        ListNode intersection = new ListNode(8);
        intersection.next = new ListNode(9);
        headA.next.next = intersection; 
        headB.next.next = intersection; 
        Solution solution = new Solution();
        ListNode result = solution.getIntersectionNode(headA, headB);
        if (result != null) {
            System.out.println("Intersection at node with value: " + result.val);
        } else {
            System.out.println("No intersection.");
        }
    }
}
