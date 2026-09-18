class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left = 1;
        int right = piles[piles.length-1];

        while(left <= right){
            int mid = left + (right-left)/2;
            int rounds = 0;
            for(int i=0; i<piles.length; i++){
                rounds += Math.ceil((double) piles[i] / mid);
            }
            if(rounds > h){
                left = mid +1;
            } else {
                right = mid - 1;
            } 
        }
        return left;
    }
}
