package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class _387_FirstUniqueCharacterInAStringTest {

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of("leetcode", 0),
                Arguments.of("loveleetcode", 2),
                Arguments.of("aabb", -1)
        );
    }
    @ParameterizedTest(name = "input {0}, expected {1}")
    @MethodSource("data")
    void firstUniqChar(String s, int expected) {
        int actual = new _387_FirstUniqueCharacterInAString().firstUniqChar(s);
        Assertions.assertEquals(actual, expected);
    }
}