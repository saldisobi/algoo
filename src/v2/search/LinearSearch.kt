package v2.search

class LinearSearch {

    fun doLinearSearch(nums: Array<Int>, target: Int): Int {
        var i = 0
        nums.forEach {
            i++
            if (it == target) {
                return i
            }
        }

        return -1
    }
}

fun main() {
    println(LinearSearch().doLinearSearch(arrayOf(1, 2, 3, 4, 6, 8, 9, 11, 23, 45), 10))
    println(LinearSearch().doLinearSearch(arrayOf(1, 2, 3, 4, 6, 8, 9, 11, 23, 45), 45))
}