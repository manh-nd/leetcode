package array;

/**
 * @link <a href="https://leetcode.com/problems/merge-sorted-array/">leetcode</a>
 */
public class _88_MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int numberOfElements = m + n;
        int[] sortedArray = new int[numberOfElements];

        if (m == 0) {
            return nums2;
        }

        if (n == 0) {
            return nums1;
        }

        int i = numberOfElements - 1;

        while(i >= 0) {
            if(m > 0 && n > 0) {
                int num1 = nums1[m - 1];
                int num2 = nums2[n - 1];

                if(num1 > num2) {
                    sortedArray[i] = num1;
                    m--;
                } else {
                    sortedArray[i] = num2;
                    n--;
                }
            } else if(m > 0) {
                int num = nums1[m - 1];
                sortedArray[i] = num;
                m--;
            } else if(n > 0) {
                int num = nums2[n - 1];
                sortedArray[i] = num;
                n--;
            }
            i--;
        }

        return sortedArray;
    }
}
