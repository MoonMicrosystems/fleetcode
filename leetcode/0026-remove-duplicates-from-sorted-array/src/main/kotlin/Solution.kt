package org.moonmicrosystems.leetcode

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    val n = nums.size
    var pos = 1
    var oldValue = nums[0]

    for (i in 1 until n) {
        val newValue = nums[i]
        nums[pos] = newValue
        pos += if (newValue != oldValue) 1 else 0
        oldValue = newValue
    }

    return pos
}