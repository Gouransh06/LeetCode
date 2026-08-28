class Solution {
    public boolean containsDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }

        return false;   
    }
}