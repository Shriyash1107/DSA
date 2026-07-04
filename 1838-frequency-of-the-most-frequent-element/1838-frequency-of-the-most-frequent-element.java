import java.util.*;

class Solution {
    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);

        int n = nums.length;
        int l = 0;
        int ans = 1;
        long sum = 0;
        long opt;

        for (int r = 0; r < n; r++) {

            sum += nums[r];

            int window = r - l + 1;

            opt = (long) nums[r] * window - sum;

            while (opt > k) {

                sum -= nums[l];
                l++;

                window = r - l + 1;
                opt = (long) nums[r] * window - sum;
            }

            ans = Math.max(ans, window);
        }

        return ans;
    }
}