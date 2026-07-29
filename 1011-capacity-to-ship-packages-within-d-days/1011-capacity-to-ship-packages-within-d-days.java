class Solution {
      

      static int maxfind(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int x:arr){
            max = Math.max(max,x);
        }
        return max;
      }

      static int findsum(int[] arr){
        int sum = 0;
        for(int x:arr){
            sum += x;
        }
        return sum;
      }
     static int finddays(int[] weights , int days ,int mid){
                 
                 int day = 1;
                 int load = 0;
                 for(int x: weights){
                    if(load+x > mid){
                        day += 1;
                        load = x;
                    }else{
                        load += x;
                    }
                    
                 }
                 return day;



     }
    public int shipWithinDays(int[] weights, int days) {
        
        int l = maxfind(weights);
        int h = findsum(weights);
        int day = 1;

        while(l<=h){
            int mid = l+(h-l)/2;
            int myans = finddays(weights , days ,mid);
            if(myans <= days){
                day = mid;
                h = mid-1;
            } else{
                l = mid+1;
            }
        }

        return day;


    }
}