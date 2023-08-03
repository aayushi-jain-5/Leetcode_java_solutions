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
    public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        ListNode res = head;
        int index = 0, index2 = 0;
        while (cur.next != null) {
            cur = cur.next;
            index++;
        }
        int m = 0;
        if (index % 2 == 1) {
            m = (index / 2) + 1;
        } else m = index / 2;
        while (index2 < m) {
            res = res.next;
            index2++;
        }
        return res;
    }
}
