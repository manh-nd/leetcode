package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class _27_RemoveElementTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 2, 3}, 3, 2, new int[]{2, 2, 0, 0}),
                Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, 5, new int[]{0, 1, 3, 0, 4, 0, 0, 0})
        );
    }

    @ParameterizedTest(name = "input {0}, val {1}, expected output {2}, expected array {3}")
    @MethodSource("data")
    void removeElement(int[] nums, int val, int expectedOutput, int[] expectedArray) {
        int output = new _27_RemoveElement().removeElement(nums, val);
        Assertions.assertEquals(output, expectedOutput);
        Assertions.assertArrayEquals(nums, expectedArray);
    }
}