class Solution {
    public int smallestNumber(int n, int t) {
        int i = n;
        while(i >= n){
            int temp = i;
            int ans = 1;
            
            while(temp > 0){
                int rem = temp % 10;
                ans *= rem;
                temp /= 10;
            }
            if(ans % t == 0){
                return i;
            }
            i++;

        }
        return n;
    }
}   