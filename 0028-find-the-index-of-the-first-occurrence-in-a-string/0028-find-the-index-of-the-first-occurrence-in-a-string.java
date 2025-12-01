class Solution {
    public int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
    return index >= 0 ? index : -1;  
        
    }
}