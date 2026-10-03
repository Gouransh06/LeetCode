class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double avg = Integer.MIN_VALUE;
        double max_avg = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        double sum = 0;

        while(right < nums.length){
            sum += nums[right];
            if(right - left + 1 == k){
                avg = sum / k;
                max_avg = Math.max(avg, max_avg);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return max_avg;
    }
}