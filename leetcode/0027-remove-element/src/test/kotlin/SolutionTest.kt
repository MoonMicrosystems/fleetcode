package org.moonmicrosystems.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class SolutionTest {
    @Test
    fun testSolution1() {
        var nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val value = 2
        val expected = intArrayOf(0, 1, 3, 0, 4)
        expected.sort()

        val k = removeElement(nums, value)
        assertEquals(k, 5)
        nums.sort(0, k)
        assertContentEquals(nums.slice(0..<k).toIntArray(), expected)
    }

    @Test
    fun testSolution2() {
        var nums = intArrayOf(3,2,2,3)
        val value = 2
        val expected = intArrayOf(3,3)
        expected.sort()

        val k = removeElement(nums, value)
        assertEquals(k, 2)
        nums.sort(0, k)
        assertContentEquals(nums.slice(0..<k).toIntArray(), expected)
    }
}