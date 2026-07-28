class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extracandies) {
        int max = candies[0];
        for(int j = 1; j < candies.length; j++){
            if(candies[j]>max){
                max = candies[j];
            }
        }
        List<Boolean> result = new ArrayList<>();
        for(int i =  0; i < candies.length; i++){
            result.add(candies[i] + extracandies >= max);
        }  
        return result;
    }
}