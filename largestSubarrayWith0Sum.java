class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxSize = -1;
        int sum = 0;
        hm.put(sum , maxSize);
        
        for(int i=0 ; i< n ; i++){
             sum += arr[i];
            
            if(!hm.containsKey(sum)) hm.put(sum , i);
            else maxSize = Math.max(maxSize , i - hm.get(sum));
            
        }
        
        return maxSize==-1 ? 0 : maxSize;
    }
}
