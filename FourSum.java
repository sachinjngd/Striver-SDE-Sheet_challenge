class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int a = nums[i];
                int b = nums[j];
                int c = j+1;
                int d = nums.length-1;
               int diff= target-(a+b);
                while(c<d){
                    int sum = nums[c]+nums[d];
                    if(sum==diff){
                         List<Integer> al = new ArrayList<>();
                         al.add(a);
                        al.add(b);
                        al.add(nums[c]);
                        al.add(nums[d]);
                        if(!res.contains(al)){
                            res.add(al);
                        }
                        c++;
                        d--;
                    }
                   else if(sum < diff){
                        c++;
                    }
                    else{
                        d--;
                    }
                }
                
            }
        }
        return res;
    }
}
