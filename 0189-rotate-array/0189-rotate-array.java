class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        abc(nums, 0, nums.length - 1);
        abc(nums, 0, k - 1);
        abc(nums, k, nums.length - 1);
    }
    static void abc(int[] nums, int start, int end){

        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
// [7, 6, 5, 4, 3, 2, 1]