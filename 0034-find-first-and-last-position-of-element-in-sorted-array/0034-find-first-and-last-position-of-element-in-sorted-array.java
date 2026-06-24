class Solution {
       public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        
        // Find first element >= target.
        int noSmallerPos = binarySearch(nums, target, false);
        if (noSmallerPos == nums.length || nums[noSmallerPos] != target) return new int[]{-1, -1};
        
        // Find first element > target.
        int biggerPos = binarySearch(nums, target, true);
        return new int[]{noSmallerPos, biggerPos - 1}; 
    }
    
    private int binarySearch(int[] nums, int target, boolean ifAskBigger) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mi = lo + ((hi - lo) >> 1);
            if (nums[mi] < target) lo = mi + 1;
            else if (nums[mi] > target) hi = mi - 1;
            else if (ifAskBigger) lo = mi + 1;
            else hi = mi - 1;
        }
        return lo;
    }
}