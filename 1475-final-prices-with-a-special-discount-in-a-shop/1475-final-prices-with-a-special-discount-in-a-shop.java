class Solution {
    public int[] finalPrices(int[] prices) {
        
        int[] ans = new int[prices.length]; 
        int i = 0;
        int index = 0;
        int j = 1;
        while(i < prices.length - 1){
            boolean isfound = false;
            while(j < prices.length){
                if(prices[j] <= prices[i]){
                    ans[index] = prices[i] - prices[j];
                    index++;
                    isfound = true;
                    break;
                }
                else{
                    j++;
                }
            }
            if(isfound == false){
                ans[index] = prices[i];
                index++;
            }
            isfound = false;
            i++;
            j = i + 1;
        }
        ans[ans.length - 1] = prices[prices.length - 1];
        return ans;
    }
}