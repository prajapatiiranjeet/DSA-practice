class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int l = 0;
        int h = arr.length-1;
        int ans = -1;
        while(l <= h){
            int mid = l + (h-l)/2;
            
            if(arr[mid] <= x){
                ans = mid;
                l = mid+1;
            }else{
                h = mid-1;
            }
            
        }
        return h;
    }
}
