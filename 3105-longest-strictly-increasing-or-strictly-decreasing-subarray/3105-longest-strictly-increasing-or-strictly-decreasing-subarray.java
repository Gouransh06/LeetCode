class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        int count1 = 1;
        int max = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                count1++;
            }
            if(nums[i] <= nums[i - 1]){
                count1 = 1;
            }
            max = Math.max(max,count1);
        }
        int max2 = 1;
        int count2 = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                count2++;
            }
            if(nums[i] >= nums[i - 1]){
                count2 = 1;
            }
            max2 = Math.max(max2,count2);
        }
        return max2 > max ? max2 : max;
    }
}