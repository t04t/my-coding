// https://leetcode.com/problems/add-two-numbers/?envType=study-plan-v2&envId=top-interview-150
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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var p1 = l1
        var p2 = l2
        val dummy = ListNode(-1)
        var curNode = dummy
        var carry = 0
        while (p1 != null || p2 != null)  {
            val x = p1?.`val` ?: 0
            val y = p2?.`val` ?: 0

            var sum = x + y + carry
            carry = sum / 10

            curNode.next = ListNode(sum % 10)
            curNode = curNode.next!!

            p1 = p1?.next
            p2 = p2?.next
        }
        if (carry != 0) {
            curNode.next = ListNode(carry)
        }
        return dummy.next
    }
}