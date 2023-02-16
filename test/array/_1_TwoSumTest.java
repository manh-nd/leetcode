package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class _1_TwoSumTest {
    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2}, 9, new int[]{})
        );
    }
    @ParameterizedTest(name = "input {0}, target {1}, expected {2}")
    @MethodSource("data")
    void twoSum(int[] input, int target, int[] expected) {
        _1_TwoSum instance = new _1_TwoSum();
        int[] actual = instance.twoSum(input, target);
        Assertions.assertArrayEquals(expected, actual);
    }
}