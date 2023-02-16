package array;

public class _387_FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();

        int[] counts = new int[127];

        for (char c : chars) {
            if (counts[c] > 0) {
                counts[c] += 1;
            } else {
                counts[c] = 1;
            }
        }

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(counts[c] == 1) {
                return i;
            }
        }

        return -1;
    }
}
