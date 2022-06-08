import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int[] substitute = new int[arr.size()+1];
        int[] ans = new int[2];
        for(int i=0 ; i <arr.size() ; i++){
            substitute[arr.get(i)]++;
        }
        
         for(int i=1 ; i <=arr.size() ; i++){
            if(substitute[i] == 0){
                ans[0] = i;
            }
            if(substitute[i] > 1){
                ans[1] = i;
            }
                
            }
        
        return ans;
        }
    
}
