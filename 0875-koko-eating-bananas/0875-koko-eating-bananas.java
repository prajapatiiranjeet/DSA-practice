class Solution {
    static long binsr(int[] piles , int speed){
      
        long hours = 0;

        for (int pile : piles) {
            hours += (long)(pile + speed-1)/ speed;
        }

        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        // Arrays.sort(piles);
        int l = 1;
       int e = 0;

for(int pile : piles){
    e = Math.max(e, pile);
}
        int speed = l + (e-l)/2;
        int ans = -1;
        while(l <= e){
            speed = l + (e-l)/2;
            long hour = binsr(piles,speed);
            if(hour > h){
             
              
               l = speed+1;
            }
            else{
                ans = (int)(speed);
                e = speed - 1;
            }
        }
        return ans;
    }
}