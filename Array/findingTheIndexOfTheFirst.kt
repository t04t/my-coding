// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    fun strStr(haystack: String, needle: String): Int {
        if (haystack == needle) return 0
        val needleLen = needle.length
        for (i in 0 until haystack.length - needleLen + 1) {
            if (haystack.substring(i, i+needleLen) == needle) {
                return i
            }
        }
        return -1
    }
}