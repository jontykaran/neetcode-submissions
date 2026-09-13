class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int last = numbers.length-1;
        int i = 0;
        while(i<last){
            if( numbers[i] + numbers[last] > target){
                last--;
            } else if( numbers[i] + numbers[last] < target){
                i++;
            } else {
                return new int[]{i+1, last+1};
            }
        }
        return new int[]{};
    }
}
