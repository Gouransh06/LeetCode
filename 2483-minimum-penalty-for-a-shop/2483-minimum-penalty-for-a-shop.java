class Solution {
    public int bestClosingTime(String customers) {
        int penalty = 0;

        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y') {
                penalty++;
            }
        }
        int min = penalty;
        int ans = 0;
        for (int j = 0; j < customers.length(); j++) {
            if (customers.charAt(j) == 'Y') {
                penalty--;
            } else {
                penalty++;
            }
            if (penalty < min) {
                min = penalty;
                ans = j + 1;
            }
        }
        return ans;
    }
}