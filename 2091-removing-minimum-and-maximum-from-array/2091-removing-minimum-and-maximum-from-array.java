class Solution {
    public int minimumDeletions(int[] nums) {

        int max = 0;
        int min = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > nums[max]) {
                max = i;
            }
            if (nums[i] < nums[min]) {
                min = i;
            }

        }

        int case1 = Math.max(min, max) + 1;
        int case2 = nums.length - Math.min(min, max);
        int case3 = Math.min(min, max) + 1 + nums.length - Math.max(min, max);

        return Math.min(case1, Math.min(case2, case3));
    }
}