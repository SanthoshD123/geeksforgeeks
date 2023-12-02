class Solution {
public:
    /* Function to count even and odd elements in the array
     * arr : Array with its elements
     * sizeof_array : number of array elements
     * countOdd : variable to count the number of odd elements
     * countEven : variable to count the number of even elements
     */
    void countOddEven(int arr[], int sizeof_array) {
        int countOdd = 0, countEven = 0;

        for (int i = 0; i < sizeof_array; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        // Printing the counts
        cout << countOdd << " " << countEven << endl;
    }
};
