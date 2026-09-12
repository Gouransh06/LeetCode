class Solution {
    public int maxArea(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int maxarea = 0;
        int area = 0;

        while(left < right){
            area = Math.min(nums[left], nums[right]) * (right - left);
            maxarea = Math.max(area, maxarea);

            if(nums[left] > nums[right]){
                right--;
            } else{
                left++;
            }
        }
        return maxarea;
    }
}