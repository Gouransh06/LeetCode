class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {


        int left = 0;
        int right = matrix.length - 1;

        while(left <= right){

            int mid = left + (right - left)/2;

            if(target >= matrix[mid][0] && target <= matrix[mid][matrix[mid].length - 1]){
                int l = 0;
                int r = matrix[mid].length - 1;

                while(l <= r){

                    int m = l + (r - l)/2;

                    if(matrix[mid][m] == target){
                        return true;
                    }
                    else if(matrix[mid][m] > target){
                        r = m - 1;
                    }
                    else{
                        l = m + 1;
                    }
                }
                return false;

            }
            else if(target > matrix[mid][matrix[mid].length - 1]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }

        }
        return false;   
    }
}