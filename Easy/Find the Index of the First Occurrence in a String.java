class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.substring(i,i+needle.length()).compareTo(needle)==0)
            return i;
        }
        return -1;
    }
}
