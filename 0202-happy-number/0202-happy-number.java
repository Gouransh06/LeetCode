class Solution {
    public int function(int num) {
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            sum += (temp) * (temp);
            num /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {

        while(n != 1 && n != 4){
            n = function(n);
        }
        return n == 1;
    }
}