package array.problems

class PascalTriangle {

    fun getPascalTriangle(numRows: Int): List<List<Int>> {

        var pascalTriangle = ArrayList<ArrayList<Int>>()

        if (numRows <= 0) {
            return pascalTriangle
        }

        var firstRow = ArrayList<Int>()

        firstRow.add(1)

        pascalTriangle.add(firstRow)

        for (i in 1 until numRows) {
            var currentRow = ArrayList<Int>()
            currentRow.add(1)
            for (j in 1 until i) {
                currentRow.add(pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j])
            }
            currentRow.add(1)

            pascalTriangle.add(currentRow)
        }

        return pascalTriangle

    }
}

fun main() {
    var pascalTriangle = PascalTriangle().getPascalTriangle(-1)
    pascalTriangle.forEach {
        println()
        it.forEach { it1 ->
            print("$it1   ")
        }
    }
}