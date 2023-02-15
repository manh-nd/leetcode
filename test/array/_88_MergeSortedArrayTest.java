package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class _88_MergeSortedArrayTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3, new int[]{1, 2, 2, 3, 5, 6}),
                Arguments.of(new int[]{1}, 1, new int[]{}, 0, new int[]{1}),
                Arguments.of(new int[]{0}, 0, new int[]{1}, 1, new int[]{1}),
                Arguments.of(new int[]{7, 3, 0}, 1, new int[]{1, 4, 6}, 2, new int[]{1, 4, 7}),
                Arguments.of(new int[]{1, 4, 6, 7, 0, 0, 0}, 4, new int[]{2, 3, 5}, 3, new int[]{1, 2, 3, 4, 5, 6, 7})
        );
    }

    @ParameterizedTest(name = "nums1 {0}, m {1}, nums2 {2}, n {3}, expected {4}")
    @MethodSource("data")
    void merge(int[] nums1, int m, int[] nums2, int n, int[] expected) {
        new _88_MergeSortedArray().merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(nums1, expected);
    }
}