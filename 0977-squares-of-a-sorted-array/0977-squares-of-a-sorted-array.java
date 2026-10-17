class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = ans.length - 1;

        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                ans[index] = nums[left] * nums[left];
                index--;
                left++;
            } else if (nums[left] * nums[left] < nums[right] * nums[right]) {
                ans[index] = nums[right] * nums[right];
                index--;
                right--;
            }
            else{
                ans[index] = nums[right] * nums[right];
                index--;
                if (left == right) {
                    break;
                }
                ans[index] = nums[left] * nums[left];
                index--;
                left++;
                right--;
            }
        }
        return ans;
    }
}