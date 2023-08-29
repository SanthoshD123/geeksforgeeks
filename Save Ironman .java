class Complete {
    boolean isAlphanumeric(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }
    
    boolean isEqualIgnoreCase(char c1, char c2) {
        return Character.toLowerCase(c1) == Character.toLowerCase(c2);
    }
    
    boolean saveIronman(String ch) {
        int left = 0, right = ch.length() - 1;
        
        while (left < right) {
            while (left < right && !isAlphanumeric(ch.charAt(left))) {
                left++;
            }
            while (left < right && !isAlphanumeric(ch.charAt(right))) {
                right--;
            }
            
            if (left < right && !isEqualIgnoreCase(ch.charAt(left), ch.charAt(right))) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
}

