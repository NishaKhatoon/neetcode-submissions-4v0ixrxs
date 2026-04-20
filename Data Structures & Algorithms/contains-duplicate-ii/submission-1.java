class Solution {
  //Approach 2 — Early-termination brute force
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0 ; i<nums.length; i++){
          // Only look ahead at most k positions — no need to go further
          for(int j=i+1; j<=Math.min(i+k,nums.length-1); j++){
              if(nums[i]==nums[j]){
                return true;
            } 
          }

        }
        return false;
    }
}