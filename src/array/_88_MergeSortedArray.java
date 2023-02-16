package array;

/**
 * @link <a href="https://leetcode.com/problems/merge-sorted-array/">leetcode</a>
 */
public class _88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;

        while(m > 0 && n > 0) {
            int num1 = nums1[m - 1];
            int num2 = nums2[n - 1];

            if(num1 > num2) {
                nums1[i--] = num1;
                m--;
            } else {
                nums1[i--] = num2;
                n--;
            }
        }

        while(n > 0) {
            int num = nums2[n - 1];
            nums1[i--] = num;
            n--;
        }
    }
}
