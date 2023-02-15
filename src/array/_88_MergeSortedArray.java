package array;

/**
 * @link <a href="https://leetcode.com/problems/merge-sorted-array/">leetcode</a>
 */
public class _88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n;

        while(i >= 0) {
            if(m > 0 && n > 0) {
                int num1 = nums1[m - 1];
                int num2 = nums2[n - 1];

                if(num1 > num2) {
                    nums1[i - 1] = num1;
                    m--;
                } else {
                    nums1[i - 1] = num2;
                    n--;
                }
            } else if(m > 0) {
                int num = nums1[m - 1];
                nums1[i - 1] = num;
                m--;
            } else if(n > 0) {
                int num = nums2[n - 1];
                nums1[i - 1] = num;
                n--;
            }
            i--;
        }
    }
}
