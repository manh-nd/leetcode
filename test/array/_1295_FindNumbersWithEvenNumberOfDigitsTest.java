package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class _1295_FindNumbersWithEvenNumberOfDigitsTest {
    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{12, 345, 2, 6, 7896}, 2),
                Arguments.of(new int[]{555, 901, 482, 1771}, 1),
                Arguments.of(new int[]{580, 317, 640, 957, 718, 764}, 0)
        );
    }

    @ParameterizedTest(name = "input {0}, output {1}")
    @MethodSource("data")
    void findNumbers(int[] nums, int expected) {
        int actual = new _1295_FindNumbersWithEvenNumberOfDigits().findNumbers(nums);
        Assertions.assertEquals(expected, actual);
    }
}