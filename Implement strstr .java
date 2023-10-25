class GfG {
    // Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x) {
        int sLen = s.length();
        int xLen = x.length();

        for (int i = 0; i <= sLen - xLen; i++) {
            int j;

            // Check if the current substring of s matches x
            for (j = 0; j < xLen; j++) {
                if (s.charAt(i + j) != x.charAt(j)) {
                    break;
                }
            }

            // If we found a match, return the starting index
            if (j == xLen) {
                return i;
            }
        }

        // If no match is found, return -1
        return -1;
    }
}
