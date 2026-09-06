class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
        1,2,4,6
        (2,4,6), (1,4,6), (1,2,6), (1,2,4)
        [1]
        [ 1,  1, 2, 8 ]
        [48, 24, 6, 1 ]
        [48, 24,12, 8 ]
        */
        int[] ans = new int[nums.length];
        int[] left = new int[nums.length];
        left[0] = 1;
        for(int i = 1; i< nums.length; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        int[] right = new int[nums.length];
        right[nums.length-1] = 1;
        for(int i=nums.length-2; i>=0; i--){
            right[i] = right[i+1] * nums[i+1];
        }

        for(int i =0; i<nums.length; i++){
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}  
