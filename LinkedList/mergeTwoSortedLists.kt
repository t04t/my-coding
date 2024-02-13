// https://leetcode.com/problems/merge-two-sorted-lists/?envType=study-plan-v2&envId=top-interview-150

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var p1 = list1
        var p2 = list2
        val dummy = ListNode(-1)
        var curNode = dummy
        while (p1 != null && p2 != null) {
            if (p1.`val` >= p2.`val`) {
                curNode.next = p2
                p2 = p2.next
            } else {
                curNode.next = p1
                p1 = p1.next
            }
            curNode = curNode.next!!
        }

        if (p1 == null) {
            curNode.next = p2
        } else {
            curNode.next = p1
        }
        return dummy.next
    }
}