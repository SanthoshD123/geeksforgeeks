class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        int []charCount = new int[26];
        for(char c:S.toCharArray()){
            charCount[c-'a']++;
        }
        for(char c : S.toCharArray()){
            if(charCount[c-'a']==1){
                return c;
            }
        }
        return '$';
    }
}
