class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] altitude = new int[n + 1];
        altitude[0] = 0;
        for(int i = 1; i <= n; i++){
            altitude[i] += altitude[i-1] + gain[i-1];
        }
        int max = altitude[0];
        for(int j = 0; j < altitude.length; j++){
            if(altitude[j] > max){
                max = altitude[j];
            }
        }
        return max;
    }
}