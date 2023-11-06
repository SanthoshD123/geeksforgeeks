class GFG {
    String longest(String names[], int n) {
        String longestName = "";
        int maxLength = 0;
        
        for (int i = 0; i < n; i++) {
            String currentName = names[i];
            int currentLength = currentName.length();
            
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestName = currentName;
            }
        }
        
        return longestName;
    }
}
