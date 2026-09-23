class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        Arrays.sort(nums);

        int left = 1;
        int right = nums[nums.length - 1];
        int sum = 0;

        while(left <= right){

            int divisor = left + (right - left) / 2;

            for(int i = 0; i < nums.length; i++){

                sum = sum + ((nums[i] + divisor - 1) / divisor);
            }
            if(sum <= threshold){
                right = divisor - 1;
            }
            else{
                left = divisor + 1;
            }
            sum = 0;
        }
        return left;
    }
}