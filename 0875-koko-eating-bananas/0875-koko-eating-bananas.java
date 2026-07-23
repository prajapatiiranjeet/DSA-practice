
class Solution {
    static int findmax(int[] piles){
        int max =Integer.MIN_VALUE;
          for(int n : piles){
            max = Math.max(max , n);
          }
          return max;

    }

   static long coco(int[] piles, int k){
    long totalTime = 0;

    for(int n : piles){
        totalTime += (n + k - 1) / k;
    }

    return totalTime;
}
    public int minEatingSpeed(int[] piles, int hour) {
        int l = 1;
        int h = findmax(piles);

        while(l<=h){
            int mid = l + (h-l)/2;
            long totaltime = coco(piles , mid);
             if(totaltime <= hour){
                h = mid - 1;
             }else{
                l = mid+1;
             }
        }

        return l;
    }
}