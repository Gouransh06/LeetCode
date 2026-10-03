class Solution {
    public int[] getAverages(int[] nums, int k) {

        int[] avgs = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            avgs[i] = -1;
        }
        int left = 0;
        int right = 0;
        long sum = 0;
        int avg = 0;

        while(right < nums.length){
            sum += nums[right];
            if(right - left + 1 == k + k + 1){
                avg = (int)(sum / (k + k + 1));
                avgs[left + k] = avg;
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return avgs;
    }
}