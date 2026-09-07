class Solution {
    public int kthFactor(int n, int k) {

        ArrayList<Integer> result = new ArrayList<>();
        int i = 1;
        while(i <= n){
            if(n % i == 0){
                result.add(i);
            }
            i++;
        }  
        if(k > result.size()){
            return -1;
        }
        return result.get(k-1);
    }
}