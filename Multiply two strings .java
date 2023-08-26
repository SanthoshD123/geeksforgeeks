class Solution {
    public String multiplyStrings(String s1, String s2) {
        boolean isNegative = false;
        if ((s1.charAt(0) == '-' && s2.charAt(0) != '-') || (s1.charAt(0) != '-' && s2.charAt(0) == '-')) {
            isNegative = true;
        }
        
        if (s1.charAt(0) == '-') {
            s1 = s1.substring(1);
        }
        if (s2.charAt(0) == '-') {
            s2 = s2.substring(1);
        }
        
        int m = s1.length();
        int n = s2.length();
        
        int[] result = new int[m + n];
        
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int product = (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
                int sum = product + result[i + j + 1];
                result[i + j] += sum / 10;
                result[i + j + 1] = sum % 10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            sb.append(digit);
        }
        
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        if (sb.length() == 0) {
            return "0";
        }
        
        return isNegative ? "-" + sb.toString() : sb.toString();
    }
}
