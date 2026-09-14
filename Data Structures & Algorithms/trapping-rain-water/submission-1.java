class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int leftMax = height[l];
        int rightMax = height[r];
        int trap = 0;
        while(l<r){
            if(height[l] < height[r]){
                l++;
                leftMax = Math.max(leftMax, height[l]);
                trap+= leftMax-height[l];
            } else {
                r--;
                rightMax= Math.max(rightMax, height[r]);
                trap+= rightMax-height[r];
            }
        }

        return trap;
    }
}
