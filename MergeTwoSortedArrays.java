class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        
        int i =0;
        int j=0;
        int k=0;
        int[] ans = new int[m+n];
        
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                ans[k] = arr1[i];
                i++;
            }
            else{
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }
        
        while(i<m){
            ans[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n){
            ans[k]=arr2[j];
            j++;
            k++;
        }
        
        for(int l=0 ; l < ans.length ; l++){
            arr1[l] = ans[l];
        }
        
    }
}
