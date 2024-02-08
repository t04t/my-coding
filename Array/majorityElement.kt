// https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    fun majorityElement(nums: IntArray): Int{
        val hashmap = HashMap<Int, Int>()
        for (num in nums) {
            if (hashmap.containsKey(num)) {
                hashmap[num] = hashmap[num]!! + 1
            } else {
                hashmap[num] = 1
            }
        }
        var maxNum = 0
        var ans = 0
        for ((i, ele) in hashmap) {
            if (ele > maxNum) {
                maxNum = ele
                ans = i
            }
        }
        return ans
    }
}

// more simple code
//fun majorityElement(nums: IntArray): Int{
//    val map = HashMap<Int, Int>()
//    nums.forEach {
//        map[it] = (map[it] ?: 0) + 1
//    }
//    return map.entries.maxByOrNull { it.value }!!.key
//}