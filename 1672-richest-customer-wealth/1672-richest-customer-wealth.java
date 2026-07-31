class Solution {
    public int maximumWealth(int[][] nums) {
        // first we will cretae a loop and add all number of that elemnt and do it for all 
        // then using if we will compare the highest value and return it
        int  max = 0;
        for (int  i = 0; i < nums.length; i++){
            int sum = 0;
            for (int j = 0; j < nums[i].length; j++){
            sum += nums[i][j];
            }
            if(sum > max){
            max = sum;
            }  
        }
        return max;
    }
}