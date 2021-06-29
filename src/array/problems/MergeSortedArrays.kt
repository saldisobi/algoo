package array.problems

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.



Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 */
class MergeSortedArrays {

    fun merge2(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var i = m - 1
        var j = n - 1
        var k = m + n - 1
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--]
            } else {
                nums1[k--] = nums2[j--]
            }
        }
        // this while loop is for the condition when nums1 doesn't contain any element.
        while (j >= 0) {
            nums1[k--] = nums2[j--]
        }


        nums1.forEach {
            print(it)
            print(" ")
        }
    }

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var firstStartIndex = nums1.size - m - 1

        var secondStartIndex = n - 1

        var insertIndex = nums1.size - 1

        while (insertIndex >= 0) {
            if (firstStartIndex >= 0 && secondStartIndex >= 0) {
                if (nums1[firstStartIndex] >= nums2[secondStartIndex]) {
                    nums1[insertIndex] = nums1[firstStartIndex]
                    firstStartIndex--
                } else {
                    nums1[insertIndex] = nums1[secondStartIndex]
                    secondStartIndex--
                }
            } else if (firstStartIndex >= 0) {
                nums1[insertIndex] = nums1[firstStartIndex]
                firstStartIndex--

            } else if (secondStartIndex >= 0) {
                nums1[insertIndex] = nums2[secondStartIndex]
                secondStartIndex--
            }

            insertIndex--

        }

        nums1.forEach {
            print(it)
            print(" ")
        }
    }
}


fun main() {
    MergeSortedArrays().merge2(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3)
}