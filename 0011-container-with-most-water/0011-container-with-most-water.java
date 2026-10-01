class Solution {
    public int maxArea(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int area = 0;
        int max_area = 0; 

        while(left < right){

            area = (Math.min(nums[left], nums[right]) * (right - left));
            max_area = Math.max(max_area, area);

            if(nums[right] < nums[left]){
                right--;
            }
            else{
                left++;
            }
        }
        return max_area;
    }
}