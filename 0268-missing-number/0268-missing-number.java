class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        int count = 0;
        int i = 0;
        while(i < nums.length){

            if(nums[i] == i){
                count++;
                i++;
            }
            else{
                return count;
            }
        }
        return count;
    }
}