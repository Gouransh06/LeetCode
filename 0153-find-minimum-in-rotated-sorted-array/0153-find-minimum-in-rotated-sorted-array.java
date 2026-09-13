class Solution {
    public int findMin(int[] nums) {
        

        // [4, 5, 6, 7, 0, 1, 2]
        // [11, 13, 15, 17]
        // [3, 4, 5, 1, 2]
        // [8, 9, 12, 15, 2, 4, 6]
        // [13, 18, 21, 25, 30, 2, 5, 7, 9, 11]
        // [2, 4, 6, 8, 10, 12, 14, 16, 18, 1]
        // [9, 1, 2, 3, 4, 5, 6, 7, 8]


        int left = 0;
        int right = nums.length - 1;

        while(left < right){

            int mid = left + (right - left)/2;

            if(mid < nums.length - 1 && nums[mid+1] < nums[mid]){
                return nums[mid+1];
            }else if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}