class Solution {
    public int maxProfit(int[] nums) {

        int right = 0;
        int left = 0;   
        int profit = 0;
        int max = 0;

        while (right < nums.length) {
            while(nums[left] > nums[right]){
                left = right;
            }
            profit = nums[right] - nums[left];
            max = Math.max(profit, max);
            right++;
        }
        return max;
    }
}