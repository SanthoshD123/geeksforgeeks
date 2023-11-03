class Solution {
    public void printNos(int N) {
        if (N > 0) {
            printNos(N - 1); // Recursive call with N-1
            System.out.print(N + " "); // Print the current number
        }
    }
}
