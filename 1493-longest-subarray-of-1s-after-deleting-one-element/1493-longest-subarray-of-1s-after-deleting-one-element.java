class Solution {
    public int longestSubarray(int[] nums) {
        
        int left = 0;
        int right = 0;
        int count1 = 0;
        int count0 = 0;
        int length = 0;
        int max = 0;

        while(right < nums.length){
            if(nums[right] == 1){
                count1++;
            }
            if(nums[right] == 0){
                count0++;
            }
            while(count0 > 1){
                if(nums[left] == 0){
                    count0--;
                }
                else{
                    count1--;
                }
                left++;
            }
            length = count1 + count0 - 1;
            max = Math.max(length, max);
            right++;
        }
        return max;
    }
}