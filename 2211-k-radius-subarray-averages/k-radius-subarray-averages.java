class Solution {
    public int[] getAverages(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n];

        // Fill answer with -1
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        int windowSize = 2 * k + 1;

        // No complete window possible
        if (windowSize > n) {
            return ans;
        }

        long sum = 0;

        // Create first window
        for (int i = 0; i < windowSize; i++) {
            sum += nums[i];
        }

        // Sliding window
        for (int i = k; i < n - k; i++) {

            // Calculate average
            ans[i] = (int)(sum / windowSize);

            // Remove left element
            sum -= nums[i - k];

            // Add next right element
            if (i + k + 1 < n) {
                sum += nums[i + k + 1];
            }
        }

        return ans;
    }
}