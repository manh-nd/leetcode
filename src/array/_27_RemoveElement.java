package array;

/**
 * @link <a href="https://leetcode.com/problems/remove-element/">leet code</a>
 */
public class _27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int r = nums.length;
        int i = nums.length - 1;
        while(i >= 0) {
            if(nums[i] == val) {
                nums[i] = 0;

                if(i < r - 1) {
                    for(int j = i; j < r - 1; j++) {
                        swap(nums, j, j + 1);
                    }
                }

                r--;
            }
            i--;
        }

        return r;
    }

    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
