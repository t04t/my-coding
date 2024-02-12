// https://leetcode.com/problems/valid-sudoku/description/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for (row in board) {
            if (!isValid(row)) return false
        }

        for (col in 0 until board.size) {
            val column = CharArray(9)
            board.forEachIndexed  { rIndex, row ->
                column[rIndex] = row[col]
            }
            if (!isValid(column)) return false
        }

        for (startRow in 0 until 9 step 3) {
            for (startCol in 0 until 9 step 3) {
                val subBox =  CharArray(9) { i ->
                    val rowIndex = startRow + i / 3
                    val colIndex = startCol + i % 3
                    board[rowIndex][colIndex]
                }
                if (!isValid(subBox)) return false
            }
        }
        return true
    }

    fun isValid(arr: CharArray): Boolean {
        val hashSet = HashSet<Char>()
        for (char in arr) {
            if (char != '.' && !hashSet.add(char)) return false
        }
        return true
    }
}