class Solution {
    public boolean checkString(String s) {
        boolean isb = false;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'b'){
                isb = true;
            }
            if(s.charAt(i) == 'a' && isb == true){
                return false;
            }
        }
        return true;
    }
}