class Solution {
    public void nextPermutation(int[] nums) {
        int left = 0;
        int j = nums.length - 1;
        int i;
        for (i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }
        if(i < 0){
            Arrays.sort(nums);
            return;
        }
        while(nums[j] <= nums[i]){
            j--;
        }
        
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

                left = i + 1;
        j = nums.length - 1;

        while (left < j) {
            temp = nums[left];
            nums[left] = nums[j];
            nums[j] = temp;

            left++;
            j--;
        }
        
    }
}