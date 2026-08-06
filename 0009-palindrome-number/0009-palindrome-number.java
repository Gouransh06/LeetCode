class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        String str = Integer.toString(x);
        if(x == 0){
            return true;
        }
        int len = str.length();
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}