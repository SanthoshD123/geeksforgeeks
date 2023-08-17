
class Solution {
    int palindromeSubStrs(String str) {
        int n = str.length();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            // Odd length palindromes
            int left = i;
            int right = i;
            while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
                set.add(str.substring(left, right + 1));
                left--;
                right++;
            }

            // Even length palindromes
            left = i;
            right = i + 1;
            while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
                set.add(str.substring(left, right + 1));
                left--;
                right++;
            }
        }

        return set.size();
    }
}
