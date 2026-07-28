class Solution {

    static int findmin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int x : arr){
            min = Math.min(min, x);
        }
        return min;
    }

    static int findmax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int x : arr){
            max = Math.max(max, x);
        }
        return max;
    }

    static int findday(int[] arr, int k, int day){
        int count = 0;
        int bouquets = 0;

        for(int x : arr){
            if(x <= day){
                count++;
                if(count == k){
                    bouquets++;
                    count = 0;
                }
            }else{
                count = 0;
            }
        }
        return bouquets;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        if((long)m * k > bloomDay.length)
            return -1;

        int l = findmin(bloomDay);
        int h = findmax(bloomDay);

        int ans = -1;

        while(l <= h){
            int mid = l + (h - l) / 2;

            int bouquets = findday(bloomDay, k, mid);

            if(bouquets >= m){
                ans = mid;
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }

        return ans;
    }
}