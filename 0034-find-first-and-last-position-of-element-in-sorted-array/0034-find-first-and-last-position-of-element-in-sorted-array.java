class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[2];

        while(left <= right){

            int mid = left + (right - left)/2;

            if(nums[mid] >= target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        result[0] = left;
        left = 0;
        right = nums.length - 1;

        while(left <= right){

            int mid = left + (right - left)/2;

            if(nums[mid] <= target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        result[1] = right;

        if(result[0] < nums.length){
            if(nums[result[0]] == target && result[0] < nums.length){
                return result;
            }
        }
        return new int[]{-1, -1};
    }
}

