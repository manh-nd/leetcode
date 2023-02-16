package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _1672_RichestCustomerWealthTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2, 3}, {3, 2, 1}}, 6),
                Arguments.of(new int[][]{{1, 5}, {7, 3}, {3, 5}}, 10, 5),
                Arguments.of(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}, 17)
        );
    }

    @ParameterizedTest(name = "input {0}, expected {1}")
    @MethodSource("data")
    void maximumWealth(int[][] input, int expected) {
        int actual = new _1672_RichestCustomerWealth().maximumWealth(input);
        Assertions.assertEquals(actual, expected);
    }
}