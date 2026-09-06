class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<Integer>();
        for(int num: nums){
            set.add(num);
        }

        int result = 0;
        for(Integer num: set){
            int len = 1;
            int current = num;
            if(!set.contains(num-1)){
                while(set.contains(current+1)){
                    current++;
                    len++;
                }
                result = Math.max(result, len);
            }
            
        }
        return result;
    }
}
