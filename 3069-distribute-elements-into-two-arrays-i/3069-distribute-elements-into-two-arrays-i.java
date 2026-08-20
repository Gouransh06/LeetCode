class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int a = 1;
        int b = 1;

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        for (int i = 2; i < nums.length; i ++) {
            if(arr1[a - 1] > arr2[b - 1]){
                arr1[a] = nums[i];
                a++;
            }
            else{
                arr2[b] = nums[i];
                b++;
            }
        }
        int[] result = new int[nums.length];

        System.arraycopy(arr1, 0, result, 0, a);
        System.arraycopy(arr2, 0, result, a, b);

        return result;
    }
}