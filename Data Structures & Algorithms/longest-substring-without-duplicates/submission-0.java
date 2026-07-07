class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0; // Start right at 0
        int length = 0;

        HashSet<Character> set = new HashSet<>();
        
        // Loop until right reaches the end of the string
        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                // Duplicate found: shrink window from the left
                set.remove(s.charAt(left));
                left++;
            } else {
                // Unique char found: add it, expand window, update max length
                set.add(s.charAt(right));
                length = Math.max(length, right - left + 1); // Calculate length here
                right++;
            }
        }

        return length;
    }
}