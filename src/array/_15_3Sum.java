package array;

import java.util.*;

public class _15_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        int target = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            int low = i + 1;
            int high = nums.length - 1;
            int current = nums[i];

            while (low < high) {
                int triplets = current + nums[low] + nums[high];

                if(triplets > target) {
                    high--;
                } else if(triplets < target) {
                    low++;
                } else {
                    results.add(Arrays.asList(current, nums[low], nums[high]));
                    low++;

                    while(nums[low] == nums[low - 1] && low < high) {
                        low++;
                    }
                }

            }
        }
        return results;
    }
}
