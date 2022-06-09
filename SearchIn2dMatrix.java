class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i=0;
        if(matrix.length == 0 ) return false;
        int n = matrix.length;
        int m = matrix[0].length;
        int j=(matrix.length * matrix[0].length) -1;
        
        while(i<=j){
            
            int mid =(i+j)/2;
            
            if(matrix[mid/m][mid%m] < target ){
                i = mid + 1;
            }
            else if(matrix[mid/m][mid%m] > target){
                j = mid - 1;
            }
            else{
                return true;
            }
        }
        
        return false;
        
    }
}
