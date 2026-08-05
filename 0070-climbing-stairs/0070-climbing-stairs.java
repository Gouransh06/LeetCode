class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int prev1= 2;
        int prev2 = 1;
        int total = 0;
        for(int i = 3; i <= n; i++){
            total = prev1 + prev2;
            prev2 = prev1;
            prev1 = total;
        }
        return prev1    ;
    }
}