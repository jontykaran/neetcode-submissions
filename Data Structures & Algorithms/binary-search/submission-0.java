class Solution {
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length);
    }


    public int search(int[] nums, int target, int s, int e) {
        //if(s) return -1;
        if(s>=e) return -1;
        int size = e-s;
        int mid = s + size/2;
        if(nums[mid] == target){
            return mid;
        } else if (nums[mid] > target){
            return search(nums, target, s, mid);
        } else {
            return search(nums, target, mid+1, e);
        }
    }
}
