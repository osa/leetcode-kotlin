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
}