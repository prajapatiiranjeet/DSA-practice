class Solution {
    static int findmax(int[] arr){
        int ans = Integer.MIN_VALUE;
        for(int x:arr){
            ans = Math.max(ans,x);
        }
        return ans;
    }


    static int findsmall(int[] nums  , int mid){
         int ans = 0;   
          for(int x:nums){
           int ceil = (x + mid - 1)/mid;
           ans = ceil + ans;
          }
          return ans;
            
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int h = findmax(nums);
        int ans = 0;
        while(l<=h){
            int mid = l+(h-l)/2;
            int myans = findsmall(nums ,mid );
            if (myans <= threshold) {
                ans = mid;      // store divisor
                h = mid - 1;    // search for a smaller valid divisor
            } else {
                l = mid + 1;    // need a larger divisor
            }   
        }
        return ans;
    }
}