class Solution {
    public boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        
        int[] charCount = new int[26]; // Assuming lowercase letters
        
        for (int i = 0; i < a.length(); i++) {
            charCount[a.charAt(i) - 'a']++;
            charCount[b.charAt(i) - 'a']--;
        }
        
        for (int i = 0; i < 26; i++) {
            if (charCount[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
}
