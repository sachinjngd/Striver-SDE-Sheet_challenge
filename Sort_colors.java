class Solution {
    public void sortColors(int[] arr) {
        
        int i = 0;
        int mid  = 0;
        int j = arr.length - 1;
        
        
        while(mid <=j){
            if(arr[mid] == 0){
                swap(arr , mid , i);
                i++;
                mid++;
            
            }
            else if(arr[mid] ==1){
                mid++;
            }
            else{
                swap(arr , mid ,  j);
                j--;
            }
            
        }
        
    }
    
    public void swap(int[] arr , int i , int j){
        int t= arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
