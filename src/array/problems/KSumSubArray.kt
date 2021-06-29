package array.problems


/**
 *
Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
 */
class KSumSubArray {


    fun subarraySum(nums: IntArray, k: Int): Int {

        var totalSubArrays = 0

        var sum = 0

        var sumToIndexMap = HashMap<Int, Int>()

        sumToIndexMap[0] = 1


        for (i in nums.indices) {
            sum += nums[i]
            if (sumToIndexMap.containsKey(sum - k)) {
                totalSubArrays += sumToIndexMap.get(sum - k) ?: 0
            }

            sumToIndexMap[sum] = sumToIndexMap.getOrDefault(sum, 0) + 1

        }

        return totalSubArrays

    }
}


fun main() {
    println(KSumSubArray().subarraySum(intArrayOf(1, 2, 3,8), 1000))
}