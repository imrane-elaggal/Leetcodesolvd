class Solution {
    
         public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int i = 0;
        int j = 0;
        Set<Character> uniqueChars = new HashSet<>();

        while (i < n && j < n) {
            if (!uniqueChars.contains(s.charAt(j))) {
                uniqueChars.add(s.charAt(j));
                maxLength = Math.max(maxLength, j - i + 1);
                j++;
            } else {
                uniqueChars.remove(s.charAt(i));
                i++;
            }
        }

        return maxLength;
    }
        
    
}