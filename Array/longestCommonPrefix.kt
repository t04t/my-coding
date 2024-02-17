// https://leetcode.com/problems/longest-common-prefix/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        val minStr = strs.minByOrNull { it.length } ?: return ""
        for (i in minStr.indices) {
            val char = minStr[i]
            for (str in strs) {
                if (str[i] != char) return minStr.substring(0, i)
            }
        }
        return minStr
    }
}