/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode temp = head;
        ListNode prev = null;

        while (temp != null && temp.next != null) {
            ListNode firstNode = temp;
            ListNode secondNode = temp.next;

            // Swap the nodes
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            if (prev != null) {
                prev.next = secondNode;
            } else {
                head = secondNode;
            }

            prev = firstNode;
            temp = firstNode.next;
        }

        return head;
    }
}
