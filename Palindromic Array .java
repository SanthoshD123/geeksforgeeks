class GfG {
    public static int palinArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (!isPalindrome(a[i])) {
                return 0; // If any element is not a palindrome, return 0
            }
        }
        return 1; // All elements are palindromes, so return 1
    }
    
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        
        return originalNum == reversedNum;
    }
}
