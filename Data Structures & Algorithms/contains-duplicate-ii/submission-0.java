class Solution {
   //Approach 1 — Brute force (nested loops)
    public boolean containsNearbyDuplicate(int[] nums, int k) {

      for(int left=0 ; left<nums.length; left++){

        for(int right=left+1; right<nums.length; right++){
          // Both conditions must hold: same value AND distance ≤ k
            if(nums[left]==nums[right] && right-left<=k){
                return true;
            }
        }
      }
      return false;  

    }
}