class Solution {
    static int findmin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int ans : arr){
            min = Math.min(min , ans);
        }
        return min;


    }

    static int findmax(int[] arr){
          int max = Integer.MIN_VALUE;

           for(int ans : arr){
            max = Math.max(max, ans);
        }
          
          return max;
    }


    static int findday(int[] arr , int m ,int k, int mid ){
            int count = 0;
            int ans = 0;
            for(int art:arr){
                if(art <= mid){
                    count = count+1;
                    if(count == k){
                        ans = ans+1;
                        count = 0;
                    }

                }else{
                    count = 0;
                }
            }
            return ans;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int l = findmin(bloomDay);
        int h = findmax(bloomDay);
        int ans = -1;

        if((long)m*k > bloomDay.length){
            return -1;
        }

        while(l<=h){
            int mid = l+(h-l)/2;
            int getans = findday(bloomDay , m , k , mid);
           if(getans >= m){
               ans = mid;
               h = mid - 1;
              }else{
               l = mid + 1;
           }
        }
        return ans;
    }
}