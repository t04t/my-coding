// https://leetcode.com/problems/linked-list-cycle/description/?envType=study-plan-v2&envId=top-interview-150

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
    fun hasCycle(head: ListNode?): Boolean {
        var fast = head
        var slow = head
        while (fast != null && fast.next != null) {
            fast = fast.next!!.next
            slow = slow!!.next
            if (slow == fast) return true
        }
        return false
    }
}