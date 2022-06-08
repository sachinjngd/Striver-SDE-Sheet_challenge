class Solution {
    public int findDuplicate(int[] arr) {
        
        for(int i=0 ; i< arr.length ; i++){
            
            int index = arr[i];
            if(index<0){
                index = Math.abs(arr[i]);
            }
            if(arr[index] < 0){
                return index;
            }
            else{
                arr[index] = arr[index] * -1;
            }
            
            
            
        }
        
        return -1;
    }
}
