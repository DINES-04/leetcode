import java.util.Scanner;

class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l2;
        }
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        int carry = 0;
        ListNode p = l1;
        ListNode q = l2;
        while(p != null || q != null) {
            int temp1 = (p != null) ? p.val : 0;
            int temp2 = (q != null) ? q.val : 0;
            int sum = temp1 + temp2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            current.next = new ListNode(sum);
            current = current.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return dummy.next;
    }
    public static ListNode buildList(int[] nums) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first list size:");
        int n1 = scanner.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter the elements of the first list:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = scanner.nextInt();
        }

        System.out.print("Enter the second list size:");
        int n2 = scanner.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter the elements of the second list:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = scanner.nextInt();
        }

        ListNode l1 = buildList(nums1);
        ListNode l2 = buildList(nums2);

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        System.out.println("The resulting list is:");
        printList(result);
    }
}
