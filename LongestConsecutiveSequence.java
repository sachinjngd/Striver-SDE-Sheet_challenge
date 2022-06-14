class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for(int x : nums)set.add(x);
        
        for(int x : nums){
            int count = 1;
            int val = x;
            if(set.contains(val - 1))continue;
            else{
                while(set.contains(val + 1)){
                    count++;
                    val++;
                }
            }
            
            max = Math.max(count , max);
            
        }
        
        return max;
    }
}
