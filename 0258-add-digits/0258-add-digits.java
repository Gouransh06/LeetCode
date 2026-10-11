class Solution {
    public int addDigits(int num) {
        int sum = 0;
        if (num < 10) {
            return num;
        }
        while (num > 9) {
            int n = num;
            while (n > 0) {
                int temp = n % 10;
                sum += temp;
                n /= 10;
            }
            num = sum;
            sum = 0;
        }
        return num;
    }
}