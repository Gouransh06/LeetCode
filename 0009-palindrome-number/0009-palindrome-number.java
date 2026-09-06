class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0 ){
            return false;
        }
        if(x < 10){
            return true;
        }
        int n = x;
        int reverse = 0;
        while(x > 0){
            int rem = x % 10;
            x /= 10;
            reverse = (reverse * 10) + rem;
        }
        if(reverse == n){
            return true;
        }
        return false;
    }
}