Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]

Output: ["Alaska","Dad"]

Explanation:

Both "a" and "A" are in the 2nd row of the American keyboard due to case insensitivity.

Example 2:

Input: words = ["omk"]

Output: []

Example 3:

Input: words = ["adsdf","sfd"]

Output: ["adsdf","sfd"]

Solution:

class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> ans=new ArrayList<>();
       String first = "qwertyuiop";
       String Secound ="asdfghjkl";
       String Third="zxcvbnm";
       for(String i : words){
        if(isinrow(i,first) || isinrow(i,Secound) || isinrow(i,Third))
         ans.add(i);
       } 
       return ans.toArray(new String[0]);
    }
    private boolean isinrow(String s,String row){
      for(char c:s.toCharArray()){
        if(row.indexOf(Character.toLowerCase(c))==-1){
            return false;
        }
      }
      return true;
    }
}
