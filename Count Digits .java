class Solution {
    static int evenlyDivides(int N) {
        // Convert the number to a string to iterate through its digits
        String N_str = Integer.toString(N);

        // Initialize a counter for the number of digits that evenly divide N
        int count = 0;

        // Iterate through each digit in the string representation of N
        for (char digitChar : N_str.toCharArray()) {
            // Convert the digit back to an integer
            int digit = Character.getNumericValue(digitChar);

            // Check if the digit evenly divides N (leaves a remainder of 0)
            if (digit != 0 && N % digit == 0) {
                count++;
            }
        }

        return count;
    }

    // Example usage:
    public static void main(String[] args) {
        int N1 = 12;
        System.out.println(evenlyDivides(N1));  // Output: 2

        int N2 = 23;
        System.out.println(evenlyDivides(N2));  // Output: 0
    }
}
