// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var position = 1
        for (i in 1 until nums.size) {
            if (nums[i] != nums[i-1]) {
                nums[position] = nums[i]
                position++
            }
        }
        return position
    }
}