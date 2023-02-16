package array;

public class _1672_RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int cash : account) {
                sum += cash;
            }

            if(sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
