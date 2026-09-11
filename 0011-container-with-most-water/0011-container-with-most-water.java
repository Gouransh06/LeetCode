class Solution {
    public int maxArea(int[] nums) {
        
        int left = 0;
        int right = nums.length - 1;
        int area = 0;
        int max_area = 0;

        while(left < right){

            area = Math.min(nums[left], nums[right]) * (right - left);
            max_area = Math.max(area, max_area);

            if(nums[left] < nums[right]){
                left++;
            } else{
                right--;
            }
        }
        return max_area;
    }
}