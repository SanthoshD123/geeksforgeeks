class Solution {
    float[] streamAvg(int[] arr, int n) {
        float[] averages = new float[n];
        float sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            averages[i] = sum / (i + 1);
        }

        return averages;
    }
}
