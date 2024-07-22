/* Given a string s which consists of lowercase or uppercase letters, return the length of the longest 
palindrome
 that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome.

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.*/

class Solution {
    public int longestPalindrome(String s) {
        int length = s.length();
        int ans = 0;
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0;i<length;i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }

        Boolean isOdd=false;
        for(Map.Entry<Character,Integer> entry : freq.entrySet()){
            int fr = entry.getValue();
            if(fr % 2 == 0){
                ans = ans + fr;
            }else {
                ans = ans + (fr - 1);
                isOdd=true;
            }
        }
        return isOdd ? ans +1 :ans;
    }
}

/*Explanation : Palindrome consists of only even number of characters (abba) or even number of characters + 1 odd character (abbdbba).
We first create a hashmap to capture frequency of all characters present in the string.
Then we run loop for each character, if it's frequency is even , 
then it can be used to make palindrome, so we directly add it to answer.
If frquency is odd , then we subtract 1 from it, remainder is even and can be used to make palidrome, so we add that 
and add one (this is to denote that 1 odd character can be present in the middle of palindrome (abbdbba)).*/
