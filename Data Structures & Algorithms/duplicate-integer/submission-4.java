class Solution {
    public boolean hasDuplicate(int[] nums) {

       for(int i=0; i<nums.length; i++){ //iterate from 0 to array n-1 length
          
          for(int j=i+1; j<nums.length; j++){

            if(nums[j]==nums[i]){
              return true;
            }
          }

       } 
       return false;
 
    }
}