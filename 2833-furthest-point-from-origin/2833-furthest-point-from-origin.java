class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count_ = 0;
        int countl = 0;
        int countr = 0;

        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'L'){
                countl++;
            }
            if(moves.charAt(i) == 'R'){
                countr++;
            }
            if(moves.charAt(i) == '_'){
                count_++;
            }
        }        
        if(countl > countr){
            return countl + count_ - countr;
        }
        if(countr > countl){
            return countr + count_ - countl;
        }
        return count_;
    }
}
