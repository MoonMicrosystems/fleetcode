package org.moonmicrosystems.leetcode

fun main() {
    var arr1 = intArrayOf(1, 2, 3, 0, 0, 0)
    var arr2 = intArrayOf(2, 5, 6)
    val expected = intArrayOf(1, 2, 2, 3, 5, 6)

    merge(arr1, 3, arr2, 3)

    if (!(arr1 contentEquals expected)) {
        println("Arrays are not the same! ${arr1.contentToString()}")
    }
}