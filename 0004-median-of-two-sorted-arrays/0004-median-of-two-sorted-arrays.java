class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double mid = 0;
        int[] nums = new int[nums1.length + nums2.length];
        int j = 0;
        for(int i = 0; i < nums1.length; i++){
            nums[j] = nums1[i];
            j++;
        }
        for(int i = 0; i < nums2.length; i++){
            nums[j] = nums2[i];
            j++;
        }

        Arrays.sort(nums);
        if(nums.length % 2 != 0){
            mid = nums[nums.length/2];
        }
        else{
            mid = (nums[nums.length/2] + nums[nums.length/2 - 1]) / 2.0;
        }

        return mid;
    }
}