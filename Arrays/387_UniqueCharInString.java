/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1. */

class Solution {
     public int firstUniqChar(String s) {
        // HashMap to store character frequencies
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count character occurrences
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCount.get(c) == 1) {
                return i; // Found the first unique character
            }
        }

        // No unique characters found
        return -1;
    }
}

/*HashMap.getOrDefault(key, defaultValue) will return the value of key , 
  otherwise it will return defaultValue passed a 2nd argunment*/
