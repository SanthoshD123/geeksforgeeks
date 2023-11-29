class Solution {
    String UncommonChars(String A, String B) {
        // Create sets of characters for each string
        Set<Character> setA = new HashSet<>();
        Set<Character> setB = new HashSet<>();

        // Populate sets with characters from strings
        for (char ch : A.toCharArray()) {
            setA.add(ch);
        }

        for (char ch : B.toCharArray()) {
            setB.add(ch);
        }

        // Find uncommon characters
        Set<Character> uncommonChars = new TreeSet<>(setA);
        uncommonChars.addAll(setB);
        Set<Character> commonChars = new HashSet<>(setA);
        commonChars.retainAll(setB);
        uncommonChars.removeAll(commonChars);

        // If there are no uncommon characters, return "-1"
        if (uncommonChars.isEmpty()) {
            return "-1";
        }

        // Convert the set to a sorted string
        StringBuilder result = new StringBuilder();
        for (char ch : uncommonChars) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        String A1 = "geeksforgeeks";
        String B1 = "geeksquiz";
        System.out.println(solution.UncommonChars(A1, B1));  // Output: fioqruz

        String A2 = "characters";
        String B2 = "alphabets";
        System.out.println(solution.UncommonChars(A2, B2));  // Output: bclpr
    }
}
