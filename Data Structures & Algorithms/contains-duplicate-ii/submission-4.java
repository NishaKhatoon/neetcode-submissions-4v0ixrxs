class Solution {
   //Approach 4 — Sliding window with HashSet ✦ optimal
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // The window holds at most k distinct elements
          Set<Integer> windows = new HashSet<>();
          for(int i=0; i<nums.length; i++){
          // If this value is already in the window, indices are within k
               if(windows.contains(nums[i])){
                   return true;
               }
                windows.add(nums[i]);
          // Evict the element that just left the window (i - k steps ago)
            if (windows.size() > k) {
                windows.remove(nums[i - k]);
            }

          }

           return false;
        
    }
}