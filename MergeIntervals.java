class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals , (a,b)-> Integer.compare(a[0] , b[0]));
        
        ArrayList<int[]> ans = new ArrayList<>();
        
        for(int[] interval : intervals){
            if(ans.size() == 0){
                ans.add(interval);   
            }
            else {
                int[] prev = ans.get(ans.size() - 1);
                if(interval[0] <= prev[1]){
                    prev[1] = Math.max(prev[1] , interval[1]);
                }
                else{
                    ans.add(interval);
                }
            }
            
            
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
