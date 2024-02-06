// https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var l1 = m - 1
        var l2 = n - 1
        var l = m + n - 1
        while (l1 >= 0 && l2 >= 0) {
            if (nums1[l1] > nums2[l2]) {
                nums1[l] = nums1[l1]
                l1 --
            } else {
                nums1[l] = nums2[l2]
                l2 --
            }
            l --
        }

        while (l2 >= 0) {
            nums1[l] = nums2[l2]
            l --
            l2 --
        }
    }
}