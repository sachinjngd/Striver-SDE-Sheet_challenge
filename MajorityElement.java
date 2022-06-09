import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] nums, int n) {
		// Write your code here.
        int count =0;
        int candidate = 0;
        
        for(int x :nums){
            if(count ==0){
                candidate = x;
            }
            if(x == candidate){
                count += 1 ;
            }
            else{
                count -= 1 ;
            }
        }
        count = 0;
        for(int x: nums){
            if(x == candidate) count++;
        }
        
        if(count <=n/2) return -1;
        return candidate;
	}
}
