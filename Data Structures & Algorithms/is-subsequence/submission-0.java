class Solution {
    //using two pointers
    public boolean isSubsequence(String s, String t) {
         int p1=0,p2=0;
         while(p1<s.length() && p2<t.length()){
            // Compare characters, increment both pointers if same
            if(s.charAt(p1)== t.charAt(p2)){
                p1++;
                p2++;
            }else{
                // Only increment second pointer
                p2++;
            }
         }
 // If it is a subsequence, 'p1' will have travelled full
    // length of string 's', so just check and return
         return p1==s.length();
    }
}