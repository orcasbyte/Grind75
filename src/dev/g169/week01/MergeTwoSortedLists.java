package dev.g169.week01;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

/**
 * <h1>Merge Two Sorted Lists</h1>
 * <p>
 * <span>🔗 Link:
 * </span><span>https://leetcode.com/problems/merge-two-sorted-lists/description/</span>
 * </p>
 * <p>
 * <span>💪🏼 Difficulty: </span><strong style="color: green">Easy</strong>
 * </p>
 * <p>
 * <span>🏷️ Topics: </span><span>Linked List, Recursion</span>
 * </p>
 */
public class MergeTwoSortedLists {

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode resultList;
        if (list1.val <= list2.val) {
            resultList = list1;
            list1 = list1.next;
        } else {
            resultList = list2;
            list2 = list2.next;
        }

        ListNode head = resultList;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                resultList.next = list1;
                resultList = resultList.next;
                list1 = list1.next;
            } else {
                resultList.next = list2;
                resultList = resultList.next;
                list2 = list2.next;
            }
        }

        if (list1 == null)
            resultList.next = list2;
        else
            resultList.next = list1;

        return head;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // while (list1 != null) {
        // System.out.print(list1.val + " ");
        // list1 = list1.next;
        // }

        // System.out.println();

        // while (list2 != null) {
        // System.out.print(list2.val + " ");
        // list2 = list2.next;
        // }

        ListNode result = mergeTwoLists(list1, list2);
        while (result != null) {
            if (result.next == null)
                System.out.println(result.val);
            else
                System.out.print(result.val + " -> ");
            result = result.next;
        }

    }

}
