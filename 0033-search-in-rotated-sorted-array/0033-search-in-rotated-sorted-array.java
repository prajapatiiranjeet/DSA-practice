class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        int ans = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                ans = mid;
                return ans; // Found target, return immediately
            }

            // Check if left half is sorted
            if (nums[l] <= nums[mid]) {
                // If target is in the sorted left half
                if (nums[l] <= target && target < nums[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                // Right half is sorted
                if (nums[mid] < target && target <= nums[h]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }
        return ans;
    }
}