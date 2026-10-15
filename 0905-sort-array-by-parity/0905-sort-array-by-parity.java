class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int right = nums.length - 1;

        for(int i = 0; i <= right; i++){
            if(nums[i] % 2 != 0){
                int temp = nums[i];
                nums[i] = nums[right];
                nums[right] = temp;
                right--;
                i--;
            }
        }
        return nums;
    }
}