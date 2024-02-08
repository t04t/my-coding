// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var position = 2
        for (i in 2 until nums.size) {
            if (nums[position-2] != nums[i]) {
                nums[position] = nums[i]
                position++
            }
        }
        return position
    }
}