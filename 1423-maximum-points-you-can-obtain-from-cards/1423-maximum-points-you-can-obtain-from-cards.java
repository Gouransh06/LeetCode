class Solution {
    public int maxScore(int[] nums, int k) {
        int leftsum = 0;
        int rightsum = 0;
        int maxsum = 0;
        int currentsum = 0;
        
        int i = 0;
        int j = nums.length - 1;
        while(i < k){
            leftsum += nums[i];
            i++;
        }
        i = k-1;
        maxsum = leftsum;

        while(i >= 0){
            leftsum -= nums[i];
            rightsum += nums[j];
            currentsum = leftsum + rightsum;
            maxsum = Math.max(maxsum, currentsum);

            j--;
            i--;

        }

        return maxsum;
    }
}