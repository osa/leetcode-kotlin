package p0001_two_sum

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class SolutionTest {
    private lateinit var sut: Solution

    @BeforeEach
    fun setUp() {
        sut = Solution()
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun `Finding two sum should return empty list for empty lists`() {
        // action
        val actual = sut.twoSum(intArrayOf(), 10)

        // asserts
        Assertions.assertArrayEquals(intArrayOf(), actual)
    }

    @Test
    fun `When result does not exist should return empty list`() {
        // action
        val actual = sut.twoSum(intArrayOf(1, 2), 1)

        // asserts
        Assertions.assertArrayEquals(intArrayOf(), actual)
    }

    @Test
    fun `Finding two sum should return expected result`() {
        // action
        val actual = sut.twoSum(intArrayOf(2, 7, 11, 15), 9)

        // asserts
        Assertions.assertArrayEquals(intArrayOf(0, 1), actual)
    }
}