class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()){
            return -1;
        }
        int low=0;
        int high=needle.length()-1;
        while(high<haystack.length()){
            if(needle.equals(haystack.substring(low,high+1))){
                return low;
            }else{
                high++;
                low++;
            }
        }
        return -1;
    }
}
