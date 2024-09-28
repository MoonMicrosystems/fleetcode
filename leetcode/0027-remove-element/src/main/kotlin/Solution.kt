package org.moonmicrosystems.leetcode

fun removeElement(nums: IntArray, `val`: Int): Int {
    var i = 0
    nums.forEach { if (it != `val`) nums[i++] = it }
    return i
}