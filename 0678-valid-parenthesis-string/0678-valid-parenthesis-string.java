class Solution {
    public boolean checkValidString(String s) {
        
        int star_count = 0;
        int right_count = 0;
        int left_count = 0;
        int per_count = 0;
        int max_count = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*'){
                star_count++;
                per_count--;
                max_count++;
            }
            if(s.charAt(i) == '('){
                left_count++;
                per_count++;
                max_count++;
            }
            if(s.charAt(i) == ')'){
                right_count++;
                per_count--;
                max_count--;
            }
            if(max_count < 0){
                return false;
            }

            if(per_count < 0){
                per_count = 0;
            }
        }
        return per_count == 0;
    }
}