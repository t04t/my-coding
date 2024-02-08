// https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var k = 0
        for (i in 0 until nums.size ) {
            if (nums[i] != `val`) {
                nums[k] = nums[i]
                k++
            }
        }
        return k
    }
}