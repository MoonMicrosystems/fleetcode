package org.moonmicrosystems.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class SolutionTest {
    @Test
    fun testSolution1() {
        var nums = intArrayOf(1, 1, 2)
        val expected = intArrayOf(1, 2)

        var k = removeDuplicates(nums);
        assertEquals(k, expected.size)
        assertContentEquals(nums.slice(0..<k).toIntArray(), expected)
    }


    @Test
    fun testSolution2() {
        var nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val expected = intArrayOf(0, 1, 2, 3, 4)

        var k = removeDuplicates(nums);
        assertEquals(k, expected.size)
        assertContentEquals(nums.slice(0..<k).toIntArray(), expected)
    }
}