class Solution {
    public String longestPalindrome(String s) {

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < s.length(); i++) {

            // odd
            int left1 = i;
            int right1 = i;

            while (left1 >= 0 && right1 < s.length() && s.charAt(left1) == s.charAt(right1)) {

                left1--;
                right1++;
            }
            int length1 = right1 - left1 - 1;
            if (length1 > maxLength) {
                maxLength = length1;
                start = left1 + 1;
            }

            // even
            int left2 = i;
            int right2 = i + 1;

            while (left2 >= 0 && right2 < s.length() && s.charAt(left2) == s.charAt(right2)) {

                left2--;
                right2++;
            }
            int length2 = right2 - left2 - 1;
            if (length2 > maxLength) {
                maxLength = length2;
                start = left2 + 1;
            }
        }
        return s.substring(start, start + maxLength);
    }
}