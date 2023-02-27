package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _15_3SumTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 1, 2, -1, -4}, Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1))),
                Arguments.of(new int[]{0, 1, 1}, List.of()),
                Arguments.of(new int[]{0, 0, 0}, List.of(Arrays.asList(0, 0, 0))),
                Arguments.of(new int[]{0, 0, 0, 0}, List.of(Arrays.asList(0, 0, 0))),
                Arguments.of(new int[]{-2, 0, 1, 1, 2}, List.of(Arrays.asList(-2, 0, 2), Arrays.asList(-2, 1, 1)))
        );
    }

    @ParameterizedTest(name = "input {0}, expected {1}")
    @MethodSource("data")
    void threeSum(int[] input, List<List<Integer>> expected) {
        List<List<Integer>> actual = new _15_3Sum().threeSum(input);
        Assertions.assertIterableEquals(actual, expected);
    }
}