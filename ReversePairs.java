class Solution {
    int result=0;
    public int reversePairs(int[] nums) {
        mergesort(0,nums.length-1,nums);
        return result;
    }
    public void mergesort(int left,int right,int[] nums)
    {
        if(left>=right)
        {
            return;
        }
        int mid=(left+right)/2;
        mergesort(left,mid,nums);
        mergesort(mid+1,right,nums);
        merge(left,mid,right,nums);
    }
    public void merge(int left,int mid,int right,int[] nums)
    {
        int temp[]=new int[right-left+1];
        int st=left;
        int rt=mid+1;
        int ind=0;
        
        // getting the number of reverse pair
        while(st<=mid && rt<=right)
        {
           if(nums[st]>(long)2*nums[rt])
           {
                    result=result+(mid-st+1); 
                    rt++;
           }
           else
           {
                st++;
           }
        }
        
        // Merge part of normal merge sort
        st=left;
        rt=mid+1;
        while(st<=mid && rt<=right)
        {
            if(nums[st]>nums[rt])
            {
                temp[ind++]=nums[rt];
                rt++;
            }
            else
            {
                temp[ind++]=nums[st];
                st++;
            }
        }
        while(st<=mid)
        {
            temp[ind++]=nums[st];
            st++;
        }
        while(rt<=right)
        {
            temp[ind++]=nums[rt];
            rt++;
        }
        for(int i=0;i<temp.length;i++)
        {
            nums[left+i]=temp[i];
        }
        
    }
}
