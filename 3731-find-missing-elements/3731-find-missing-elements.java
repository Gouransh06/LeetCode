class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        int n = nums.length - 1;
        int min = nums[0];
        int max = nums[n];
        for(int i = min + 1; i < max; i++){
            boolean found = false;
            for(int j = 0; j < n; j++){
                if(i == nums[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                result.add(i);
            }
        }
        return result;
    }
}