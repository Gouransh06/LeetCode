class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            countL++;
            if(s.charAt(i) == 'A'){
                countA++;
            }
            if(s.charAt(i) != 'L'){
                countL = 0;;
            }
            max = Math.max(countL, max);
        }
        if(countA < 2 && max < 3){
            return true;
        }
        return false;
    }
}