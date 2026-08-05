class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int n = nums.length;
        for(i = 0; i < n; i++){
            if(i == nums[i]){
                continue;
            } if (i != nums[i]){
                return i;
            }
            
        }
        return i;
    }
}