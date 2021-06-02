package array

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            if (map.containsKey(nums[i])) {
                return intArrayOf(i, map[nums[i]]!!)
            }
            map[target - nums[i]] = i
        }
        throw IllegalArgumentException("No two sum solution")
    }


}

fun main(args: Array<String>) {
    val nums = TwoSum().twoSum(intArrayOf(3, 2, 4), 6)
    println(nums[0].toString() + " " + nums[1])
}