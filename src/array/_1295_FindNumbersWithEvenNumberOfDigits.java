package array;

public class _1295_FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (hasEvenDigits(num)) count++;
        }
        return count;
    }

    boolean hasEvenDigits(int num) {
        int count = 1;
        while (num > 9) {
            num = num / 10;
            count++;
        }
        return count % 2 == 0;
    }
}
