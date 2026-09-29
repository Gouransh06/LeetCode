class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        
        int count = 0;
        double sum = 0;
        int left = 0;
        int right = 0;
        double avg = 0;
        double x = k;

        while(right < nums.length){

            sum += nums[right];

            if(right - left + 1 == k){

                avg = sum / x;
                if(avg >= threshold){
                    count++;
                }
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return count;
    }
}