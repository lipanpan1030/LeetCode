package com.lipan.s2;

public class Solution {

    /**
     * 两数相加
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode cur = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            cur.next = new ListNode(carry);
        }
        return dummyHead.next;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        //7->3
        ListNode node1 = new ListNode(9);
        node1.next = new ListNode(5);
        node1.next.next = new ListNode(4);

        //3->5
        ListNode node2 = new ListNode(3);
        node2.next = new ListNode(5);

        //0->9
        ListNode result = solution.addTwoNumbers(node1, node2);
        ListNode.printListNode(result);
    }

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }

         public static void printListNode(ListNode node) {
             StringBuilder sb = new StringBuilder("ListNode:");
             while (node != null) {
                 sb.append(node.val);
                 node = node.next;
                 sb.append("->");
             }
             System.out.println(sb.toString());
         }
    }
}
