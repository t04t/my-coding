// https://leetcode.com/problems/length-of-last-word/description/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    fun lengthOfLastWord(s: String): Int {
        var count = 0
        var i = s.length - 1

        while (i >= 0 && s[i] == ' ') {
            i--
        }

        while (i >= 0 && s[i] != ' ') {
            count++
            i--
        }

        return count
    }
}