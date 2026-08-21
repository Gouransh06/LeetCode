class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if(x == 0){
            return true;
        }

        String str = Integer.toString(x);
        int left = 0;
        int right = str.length();
        while(left < right){
            if(str.charAt(left) != str.charAt(right - 1)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}