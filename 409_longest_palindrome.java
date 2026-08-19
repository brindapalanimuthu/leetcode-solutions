Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome.

 

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.

Solution:


class Solution {
    public int longestPalindrome(String s) {
        int[] count=new int[128];
        for(char c:s.toCharArray()){
            count[c]++;
        }
        int len=0;
        boolean odd=false;
        for(int i=0;i<128;i++){
            len+=(count[i]/2)*2;
            if(count[i]%2==1){
                odd=true;
            }
        }
        if(odd){
            len++;
        }
        return len;
    }
}
