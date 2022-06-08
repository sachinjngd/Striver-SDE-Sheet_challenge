class Solution {
    public void rotate(int[][] arr) {
        
        //transpose of matrix;
        
        for(int i=0 ; i< arr.length ; i++){
            
            for(int j=i ; j< arr[0].length ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
        //reverse row wise
        
        
        for(int i=0 ; i< arr.length ; i++){
            int j = 0 ;
            int k = arr[0].length - 1;
            
            while(j<k){
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
                j++;
                k--;
            }
        }
    }
}
