class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int l = 0;
        int h = nums.length - 1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(nums[l] <= nums[mid]){
                min = Math.min(nums[l] , min);
                l = mid + 1;

            }else{
                 min = Math.min(nums[mid] , min);
                 h = mid - 1;
            }
            // }else{
            //   h = mid - 1;
            // }
        }
        return min;
    }
}