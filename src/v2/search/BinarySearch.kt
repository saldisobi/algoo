package v2.search

class BinarySearch {

    fun doBinarySearch(nums: Array<Int>, target: Int): Int {

        var left = 0
        var right = nums.size - 1
        while (left <= right) {

            val middle = (right + left) / 2

            when {
                nums[middle] == target -> {
                    return middle
                }
                nums[middle] < target -> {
                    left = middle + 1
                }
                else -> {
                    right = middle - 1
                }
            }
        }

        return -1
    }
}

fun main() {
    println(BinarySearch().doBinarySearch(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 9))
}