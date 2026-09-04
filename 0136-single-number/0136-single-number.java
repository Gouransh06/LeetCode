class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for(i = 0; i < nums.length - 1; i+=2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[i];
    }
}

// [2, 2, 1,] => [1, 2, 2]
// [4, 1, 2, 1, 2] => [1, 1, 2, 2, 4]