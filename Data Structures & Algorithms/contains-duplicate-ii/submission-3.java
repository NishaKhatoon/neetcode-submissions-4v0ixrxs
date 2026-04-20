class Solution {
  //Approach 3 — HashMap (value → last seen index)
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0; i<nums.length; i++){
          int key=nums[i];
          if(map.containsKey(key)){
            // Found a previous occurrence index — check the distance
            int lastSeenIndex=map.get(key);
             if(i-lastSeenIndex<=k){
               return true;
             }
          }
          // Always update to the most recent index for this value
            map.put(key,i);
        }
        return false;
    }
}