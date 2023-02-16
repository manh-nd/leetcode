package array;

/**
 * @link <a href="https://leetcode.com/problems/remove-element/">leet code</a>
 */
public class _27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int num : nums) {
            if (num != val) {
                nums[k] = num;
                k++;
            }
        }

        int i = nums.length;
        while (i > k) {
            nums[i-1] = 0;
            i--;
        }

        return k;
    }
}
