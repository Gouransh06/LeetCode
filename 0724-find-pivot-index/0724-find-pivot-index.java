class Solution {
    public int pivotIndex(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int leftsum = 0;
        int rightsum = 0;

        for (int i = 1; i < nums.length; i++) {
            rightsum += nums[i];
        }
        int Pivot_Index = 0;
        while (left <= right) {

            if (leftsum == rightsum) {
                return Pivot_Index;
            } else {
                leftsum += nums[left];
                if (left + 1 < nums.length) {
                    rightsum -= nums[left + 1];
                }
                Pivot_Index++;
            }
            left++;

        }
        return -1;
    }
}