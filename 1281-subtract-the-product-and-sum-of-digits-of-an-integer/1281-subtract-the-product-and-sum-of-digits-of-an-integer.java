class Solution {
    public int subtractProductAndSum(int n) {
        int ans1 = 1;
        int ans2 = 0;
        int temp = n;
        while(temp > 0){
            int rem = temp % 10;
            ans1 *= rem;
            ans2 += rem;
            temp /= 10;
        }
        return ans1 - ans2;
    }
}