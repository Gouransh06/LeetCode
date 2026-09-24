class Solution {
    public int smallestIndex(int[] nums) {
        
        int sum = 0;

        for(int i = 0; i < nums.length; i++){

            int a = nums[i];
            while(a > 0){
                int rem = a % 10;
                sum += rem;
                a /= 10; 
            }
            if(i == sum){
                return i;
            }
            sum = 0;
        }    
        return -1;    
    }
}