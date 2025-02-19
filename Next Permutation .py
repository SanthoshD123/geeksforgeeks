class Solution:
    def nextPermutation(self, arr):
        i = len(arr) - 2
        while i >= 0 and arr[i] >= arr[i + 1]:
            i -= 1
        
        if i >= 0:
            j = len(arr) - 1
            while j >= 0 and arr[j] <= arr[i]:
                j -= 1
            arr[i], arr[j] = arr[j], arr[i]

        arr[i + 1:] = reversed(arr[i + 1:])
        
        return arr
