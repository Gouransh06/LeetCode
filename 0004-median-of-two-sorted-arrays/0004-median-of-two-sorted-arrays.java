class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] nums = new int[nums1.length + nums2.length];
        for(int i = 0; i < nums1.length; i++){
            nums[i] = nums1[i];
        }
        for(int i = 0; i < nums2.length; i++){
            nums[i + nums1.length] = nums2[i];
        }
        Arrays.sort(nums);

        double median = 0;

        if(nums.length % 2 != 0){
            median = nums[nums.length / 2];
        }
        else{
            median = (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2.0;
        }
        return median;
    }
}

// A = [1, 3]
// B = [2, 4, 5]
// Answer = 3

// A = [1, 2, 3]
// B = [10, 11, 12]
// Answer = 6.5

// A = []
// B = [1, 2, 3, 4]
// Answer = 2.5

// A = [1]
// B = [2, 3, 4, 5, 6, 7, 8]
// Answer = 4.5