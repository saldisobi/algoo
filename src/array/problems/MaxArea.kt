package array.problems

class MaxArea {
    fun maxArea(height: IntArray): Int {
        var left = 0;
        var right = height.size - 1
        var maxArea = 0
        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]))
            if (height[left] < height[right]) {
                left++
            } else {
                right--;
            }
        }
        return maxArea
    }
}

fun main(){
    println(MaxArea().maxArea(intArrayOf(1,1)))
    println(MaxArea().maxArea(intArrayOf(4,3,2,1,4)))
    println(MaxArea().maxArea(intArrayOf(1,2,1)))
}