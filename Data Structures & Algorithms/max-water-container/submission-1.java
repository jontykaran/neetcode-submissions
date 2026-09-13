class Solution {
    public int maxArea(int[] heights) {
        int f = 0;
        int l = heights.length-1;

        int maxArea = 0;
        while(f<l){
            int h = Math.min(heights[f], heights[l]);
            int w = l-f;
            maxArea = Math.max(maxArea, h*w);
            if( heights[f] <= heights[l]){
                f++;
            } else {
                l--;
            }
        }
        return maxArea;
    }
}
